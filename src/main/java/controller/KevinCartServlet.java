package controller;


import model.ProductBean;
import model.ProductService;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class KevinCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProductService productService;

    public void init() {
        ServletContext application = this.getServletContext();
        ApplicationContext context = (ApplicationContext) application.getAttribute(
                WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        productService = context.getBean("productService", ProductService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //接收參數
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setCharacterEncoding("UTF-8");
        var pid0 = request.getParameter("editProductId");
        var pdaction = request.getParameter("pdaction");
        System.out.println(pdaction + " from cartServlet " + pid0);

        //自己測試數量
        var qty0 = request.getParameter("qty");
        System.out.println("qty=" + qty0);

        //驗證資料
        Map<String, String> errors = new HashMap<>();
        request.setAttribute("errors", errors);

        int pid = 0; //如果抓不到id就給預設id為0
        if (pid0 != null && pid0.length() != 0) {
            try {
                pid = Integer.parseInt(pid0);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                errors.put("id", "Id must be an integer");
            }
        }

        int qty = 0; //如果抓不到qty就給預設qty為0
        if (qty0 != null && qty0.length() != 0) {
            try {
                qty = Integer.parseInt(qty0);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                errors.put("qty", "qty must be an integer");
            }
        }
        ProductBean bean = new ProductBean();
        bean.setProductId(pid);

        var out = response.getWriter();
        int totalQTYinCart = 0;
        //判斷增刪修查
        if (pdaction != null && pdaction.equals("addToCart")) {
            System.out.println("come in select statement at CartServlet");
            List<ProductBean> result = productService.select(bean);


            HashMap qtyMap = new HashMap();
            qtyMap.put("qty1",qty);
            qtyMap.put("id",pid);

            if(request.getSession().getAttribute("cart") != null){  //如果購物車session已存在
                HashMap temp = (HashMap) request.getSession().getAttribute("cart"); //把session放的list拿出來
                temp.put("qty1",qty);
                temp.put("id",pid);
                request.getSession().removeAttribute("cart"); //把舊有的購物車session移除
                request.getSession().setAttribute("cart",temp); //把新的list存回購物車session
                totalQTYinCart = temp.size();

            }else{
                request.getSession().setAttribute("cart", qtyMap); //如果購物車session不存在 就直接new一個session把list存進去
            }
            out.print("購物車新增成功"+totalQTYinCart);
            out.close();
        } else if(pdaction != null && pdaction.equals("removeProductFromCart")){
            List<ProductBean> result = productService.select(bean);
            List<ProductBean> temp = (List<ProductBean>) request.getSession().getAttribute("cart"); //把session放的list拿出來
            System.out.println(temp.size()+": temp數量");
            for(int i=0; i<temp.size();i++){
                if(temp.get(i).getProductName().equals(result.get(0).getProductName())){
                    temp.remove(i);
                }
            }
            System.out.println("result: "+ result.get(0).getProductName());
            request.getSession().removeAttribute("cart"); //把舊有的購物車session移除
            request.getSession().setAttribute("cart",temp); //把新的list存回購物車session
            out.print("產品移除成功");
            out.close();
        }else if (pdaction != null && pdaction.equals("cartCheckOut")) {
            //把購物車清單從session cart抓出來
            List<ProductBean> result = (List<ProductBean>) request.getSession().getAttribute("cart");
            if(result!=null){
                //list forward結帳頁面 redirect到結帳頁面
                request.setAttribute("cart", result);
                request.getRequestDispatcher("EndProject/NewCart.jsp").forward(request, response);
            }else{
                out.print("CharIsEmpty");
                out.close();
            }
        }else if (pdaction != null && pdaction.equals("cartCheckOut2")) {
            //把購物車清單從session cart抓出來
            HashMap result = (HashMap) request.getSession().getAttribute("cart");
            if(result!=null){
                out.println(new JSONObject(result));
            }else{
                out.print("CharIsEmpty");
                out.close();
            }
        }
    }
}