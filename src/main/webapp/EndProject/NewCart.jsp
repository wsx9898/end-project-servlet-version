<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Cart DIY</title>


<meta http-equiv="x-ua-compatible" content="ie=edge">

<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="images/favicon.ico" type="image/x-icon" />
<!-- Mobile Specific -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- CSS Style -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.css"
	media="all">
<link rel="stylesheet" type="text/css" href="css/font-face-css.css">
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/jquery.mobile-menu.css">
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">
<link rel="stylesheet" type="text/css" href="css/revslider.css">
<!-- Google Fonts -->
<!-- Kevin CSS -->
<link rel="stylesheet" type="text/css" href="./css/kevin.css">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i"
	rel="stylesheet">
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="./jq/jquery-3.6.0.js"></script>
<script src="./jq/jquery-migrate-1.4.1.js"></script>


</head>
<body>
	<div class="container">
		<div class="cart">
			<div class="page-title">
				<h2>Shopping Cart</h2>
			</div>
			<div class="table-responsive">
				<!-- 這邊應該是form交給後端處理 -->
				<form>
					<!-- <form method="post" action="#updatePost/"> -->
					<fieldset>
						<table class="data-table cart-table" id="shopping-cart-table">
							<thead>
								<tr class="first last">
									<th rowspan="1"></th>
									<th rowspan="1"><span class="nobr">產品名稱</span></th>
									<th rowspan="1"></th>
									<th colspan="1" class="a-center"><span class="nobr">價格</span>
									</th>
									<th class="a-center qty-middle" rowspan="1">數量</th>
									<th colspan="1" class="a-center">總數</th>
									<th class="a-center" rowspan="1"></th>
								</tr>
							</thead>
							<tfoot>
								<tr class="first last">
									<td class="a-right last" colspan="50">
										<button onclick="setLocation('#')" class="button btn-continue"
											title="Continue Shopping" type="button">
											<span>繼續購物</span>
										</button>
										<button class="button btn-update" title="Update Cart"
											value="update_qty" name="update_cart_action" type="submit">
											<span>更新購物車</span>
										</button>
										<button id="empty_cart_button" class="button btn-empty"
											title="Clear Cart" value="empty_cart"
											name="update_cart_action" type="submit">
											<span>清空購物車</span>
										</button>
									</td>
								</tr>
							</tfoot>
							<tbody id="putHere">
								<tr class="classItem1" id="item1">
									<td class="image"><a class="product-image"
										title="Sample Product" href="#/women-s-crepe-printed-black/"><img
											width="75" alt="Sample Product"
											src="products-images/product1.jpg"></a></td>
									<td>
										<h2 class="product-name">
											<a href="#/women-s-crepe-printed-black/">測試產品</a>
										</h2>
									</td>
									<td class="a-center"><a title="Edit item parameters"
										class="edit-bnt" href="#configure/id/15945/"></a></td>
									<td class="a-right"><span class="cart-price"><span
											class="price" id="price1">$70.00</span></span></td>

									<!-- 改變增加商品按鈕在這邊開始 -->
									<td class="a-center movewishlist qty-middle">
										<form id='myform' method='POST' action='#'>
											<input type='button' value='-'
												class='qtyminus btn btn-success' field='quantity1'
												onclick='minus("quantity1")' /> <input type='text'
												name='quantity1' value='0' class='qty' id='quantity1' /> <input
												type='button' value='+' class='qtyplus btn btn-success'
												field='quantity1' onclick='plus("quantity1")' />
										</form>
									</td>
									<!-- 改變增加商品按鈕在這邊結束 -->
									<td class="a-right movewishlist"><span class="cart-price"><span
											class="price" id="totalPrice1">$0</span></span></td>
									<td class="a-center last"><a id="remove1"
										class="button remove" title="Remove item" href="#"><span><span>Remove
													item</span></span></a></td>
								</tr>

								<tr class="classItem2" id="item2">
									<td class="image"><a class="product-image"
										title="Sample Product" href="#women-s-u-tank-top/"><img
											width="75" alt="Sample Product"
											src="products-images/product4.jpg"></a></td>
									<td>
										<h2 class="product-name">
											<a href="#women-s-u-tank-top/">測試產品</a>
										</h2>
									</td>
									<td class="a-center"><a title="Edit item parameters"
										class="edit-bnt" href="#configure/id/15946/"></a></td>
									<td class="a-right"><span class="cart-price"><span
											class="price" id='price2'>$100</span></span></td>
									<!-- 改變增加商品按鈕在這邊開始 -->
									<td class="a-center movewishlist qty-middle">
										<form id='myform' method='POST' action='#'>
											<input type='button' value='-'
												class='qtyminus btn btn-success' field='quantity2'
												onclick='minus("quantity2")' /> <input type='text'
												name='quantity2' value='0' class='qty' id='quantity2' /> <input
												type='button' value='+' class='qtyplus  btn btn-success'
												field='quantity2' onclick='plus("quantity2")' />
										</form>
									</td>
									<!-- 改變增加商品按鈕在這邊結束 -->
									<td class="a-right movewishlist"><span class="cart-price"><span
											class="price" id="totalPrice2">$0</span></span></td>

									<td class="a-center last"><a id="remove2"
										class="button remove" title="Remove item" href="#"><span><span>Remove
													item</span></span></a></td>
								</tr>

								<tr class="classItem3" id="item3">
									<td class="image"><a class="product-image"
										title="Sample Product" href="#women-s-u-tank-top/"><img
											width="75" alt="Sample Product"
											src="products-images/product10.jpg"></a></td>
									<td>
										<h2 class="product-name">
											<a href="#women-s-u-tank-top/">測試產品</a>
										</h2>
									</td>
									<td class="a-center"><a title="Edit item parameters"
										class="edit-bnt" href="#configure/id/15946/"></a></td>
									<td class="a-right"><span class="cart-price"><span
											class="price" id='price3'>$130</span></span></td>
									<!-- 改變增加商品按鈕在這邊開始 -->
									<td class="a-center movewishlist qty-middle">
										<form id='myform' method='POST' action='#'>
											<input type='button' value='-'
												class='qtyminus btn btn-success' field='quantity3'
												onclick='minus("quantity3")' /> <input type='text'
												name='quantity3' value='0' class='qty' id='quantity3' /> <input
												type='button' value='+' class='qtyplus  btn btn-success'
												field='quantity3' onclick='plus("quantity3")' />
										</form>
									</td>
									<!-- 改變增加商品按鈕在這邊結束 -->
									<td class="a-right movewishlist"><span class="cart-price"><span
											class="price" id="totalPrice3">$0</span></span></td>
									<td class="a-center last"><a id="remove3"
										class="button remove" title="Remove item" href="#"><span><span>Remove
													item</span></span></a></td>
								</tr>


							</tbody>

						</table>
					</fieldset>
				</form>
			</div>
			<tr>
				<button class="appendItem btn btn-warning" id="here">測試新增商品</button>
			</tr>
		</div>


		<!-- Ted的 -->
		<c:if test="${not empty cart}">
			<div class="border border-2 border-info">
				<table class="table table-success table-hover table-striped w-100">
					<thead>
						<tr>
							<th scope="col">產品名稱</th>
							<th scope="col">產品類別</th>
							<th scope="col">產品價格</th>
							<th scope="col"></th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="row" items="${cart}">
							<tr>
								<td>${row.productName }</td>
								<td>${row.productCatalog }</td>
								<td>${row.productPrice }</td>
								<td><img src="${row.productImg1 }" alt=""
									style="width: 120px"></td>
								<td>
									<button onclick="removeProductFromCart(${row.productId})">移除</button>
								</td>
							</tr>
						</c:forEach>
						<!-- Ted的 -->
					</tbody>
				</table>
			</div>
		</c:if>


	</div>
	</div>
	<!-- JavaScript -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/revslider.js"></script>
	<script src="js/common.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.mobile-menu.min.js"></script>
	<!-- JavaScript DIY-->
	<script src="./js/QtyButton.js"></script>
	<script src="./js/removeItem.js"></script>
	<script src="./js/appendItem.js"></script>



	<script type="text/javascript">


		//一開始就跟servlet要求新增的購物車了
	    function CartCheckOut() {
	        $.ajax({
	            url: "CartServlet",
	            method: "post",
	            data: {
	                pdaction: "cartCheckOut",
	            },
	            success: function (res) {
	                if(res==="CharIsEmpty"){
	                    alert("目前購物車內沒有商品")
	                }else{
	                    window.location.href = "checkout.jsp";
	                }
	            },
	            error: function () {
	                alert("cart error");
	            }
	        });
	    }
    
	    //parse之後
    	var productList = '${cart}';//Ted有改寫bean的toString會印出JSON字串
    	var kevinCart = JSON.parse(productList);//parse之後
    	kevinCart[0];//第一個物品
    	console.log(kevinCart[0]);
    	console.log(kevinCart[0].productName);
    	console.log(kevinCart[0].productDesc);
    	kevinCart[1];
    
    
    </script>




</body>
</html>