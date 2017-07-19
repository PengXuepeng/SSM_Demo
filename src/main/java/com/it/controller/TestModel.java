package com.it.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.it.entities.User;

@Controller
@SessionAttributes(value={"user"},types={String.class})
@RequestMapping("/TestModel")
public class TestModel {
	private static final Log logger = LogFactory.getLog(TestModel.class);
//	@ModelAttribute
//	public void testModel(@RequestParam String userName, String age,Map<String,Object> map){ 
//		System.out.println(userName);
//		System.out.println(age);
//		map.put("user", new User(userName, age));
////		modelMap.put("user", new User(userName, age));
////System.out.println("ModelAttribute:" + user);
////		user.setEmail("xue-peng.yang@hpe.com");
////		logger.info(user.toString());
////		modelMap.addAttribute("user", user);
//		
//	}
	

	
	@ResponseBody
	@RequestMapping("/testFileUploadandRequestBody")
	public String testFileUploadandRequestBody(@RequestBody String file){
		System.out.println(file);
//		InputStream in = new FileInputStream(file);
//		in.available()
		return "Hello World: "+new Date();
	}
	
	@ResponseBody
	@RequestMapping(value="/testModelAttribute",method=RequestMethod.POST)
	public User testModelAttribute(@RequestBody String requestString){
		System.out.println(requestString);
//		user.setAge(123);
//		System.out.println(user);
		return new User();
	}
	
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String,Object> map){
		User user = new User("Dylan", 11);
		map.put("user", user);
		map.put("name", "Cathy");
		return "success";
	}
	
}
