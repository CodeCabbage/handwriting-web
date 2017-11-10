package com.handwriting.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.handwriting.entity.User;
import com.handwriting.repository.UserRepository;

@Controller
public class TestController {
	@Autowired
	private UserRepository userRepository;

	//test if build success
	@RequestMapping(value = "test")
	@ResponseBody
	public String test(){
		return "success!";
	}
	
	//test repository
//	@RequestMapping(value = "testRepository2")
//	@ResponseBody
//	public String testRepository2(){
//		String lastLoginTime = userRepository.findLastLoginTimeByUsername("admin");
//		return lastLoginTime;
//	}
	
	@RequestMapping(value = "testRepository")
	@ResponseBody
	public String testRepository(){
		List<User> userList = userRepository.findByUsername("admin");
		return userList.get(0).toString();
	}
}
