package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	@RequestMapping(path = {"/"})
	public String handlerMethod1() {
		return "/index";
	}

//	@RequestMapping(path = "/secure/login.view")
	@RequestMapping(path = "這邊對應到那邊")
	public String handlerMethod2() {
		return "/secure/login";
	}

	@RequestMapping(value = "/pages/register/registerForm.view")
	public String handlerMethod3() {
		return "/pages/register/registerForm";
	}



	@RequestMapping("/EndProject/KevinProductInfo.view")
	public String handlerMethod4() {
		return "/EndProject/KevinProductInfo.html";
	}

	@RequestMapping("/EndProject/KevinProductInfo2.view")
	public String handlerMethod5() {
		return "/EndProject/KevinProductInfo2.html";
	}

	@RequestMapping("/EndProject/KevinProductInfo3.view")
	public String handlerMethod6() {
		return "/EndProject/KevinProductInfo3.html";
	}

	@RequestMapping("/EndProject/KevinProductInfo4.view")
	public String handlerMethod7() {
		return "/EndProject/KevinProductInfo4.html";
	}

	@RequestMapping("/EndProject/KevinNewCart.view")
	public String handlerMethod8() {
		return "/EndProject/KevinNewCart.html";
	}
}
