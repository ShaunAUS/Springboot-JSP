package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Tiles 지시서
//함수 명은 중요하지않다// RestController은  mapping을 찾는다
@Controller
public class HomeController {
	
	
	
	@RequestMapping("/index")
	public String index() {
		return "home.index";
	}
	
	@RequestMapping("/help")
	public String zsd() {
		return "home.help";
	}
}
