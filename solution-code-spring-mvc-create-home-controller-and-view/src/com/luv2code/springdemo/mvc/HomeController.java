package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//dev1 code change

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
