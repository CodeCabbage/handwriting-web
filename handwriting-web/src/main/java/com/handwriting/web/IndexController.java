package com.handwriting.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String loginIndex(){
		return "index";
	}
	
	@RequestMapping(value = "/about")
	public String about(){
		return "about";
	}
	
	@RequestMapping(value = "/post")
	public String post(){
		return "post";
	}
	
	@RequestMapping(value = "/contact")
	public String contact(){
		return "contact";
	}
}
