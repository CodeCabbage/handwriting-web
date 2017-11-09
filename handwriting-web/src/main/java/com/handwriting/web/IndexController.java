package com.handwriting.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	//test if build success
	@RequestMapping(value = "test")
	@ResponseBody
	public String test(){
		return "success!";
	}
}
