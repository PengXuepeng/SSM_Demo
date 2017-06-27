package com.it.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.it.entities.User;

@Controller
@RequestMapping("/springmvc")
@SessionAttributes(value=("Time"))
public class SpringMVCTest {
	private static final String SUCCESS = "success";
	@RequestMapping(value="/testPostMethod",method=RequestMethod.POST)
	public String testPostMethod(){
		System.out.println("testPostMethod");
		return SUCCESS;
	}
	@RequestMapping(value="/testGetMethod",method=RequestMethod.GET)
	public String testGetMethod(){
		System.out.println("testGetMethod");
		return SUCCESS;
	}
	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		System.out.println("testPathVariable"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testPUTMethod/{id}", method=RequestMethod.PUT)
	public String testPUTMethod(@PathVariable("id") Integer id){
		System.out.println("testPUTMethod"+id);
		return SUCCESS;
	}
	@RequestMapping(value="/testdeleteMethod/{id}", method=RequestMethod.DELETE)
	public String testdeleteMethod(@PathVariable("id") Integer id){
		System.out.println("testdeleteMethod"+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam String username, @RequestParam(value="age",required=false,defaultValue="0" ) String age){
		System.out.println("testRequestParam: username = "+username+", age = "+age);
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestParambyForm")
	public String testRequestParambyForm(@RequestParam String username, @RequestParam String age){
		System.out.println("testRequestParam: username = "+username+", age = "+age);
		return SUCCESS;
	}
	@RequestMapping("/testRequestParambyForm2")
	public String testRequestParambyForm2(User user){
		System.out.println("testRequestParam: username = "+user);
		return SUCCESS;
	}
	
	@RequestMapping("/testCookie")
	public String testCookie(@CookieValue(value="JSESSIONID") String cookie){
		System.out.println("testCookie:" +cookie);
		return SUCCESS;
	}
	
	@RequestMapping("/testServletAPI")
	public void testServletAPI(Writer out) throws IOException{
		System.out.println("testServletAPI");
		out.write("Hello World");
	}
	
//	test ModelandView & @SessionAttributes
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(ModelAndView modelAndView){
		String viewName = SUCCESS;
		System.out.println("testModelAndView");
		modelAndView.setViewName(viewName);
		modelAndView.addObject("Time", new Date());
		modelAndView.addObject("user", new User("Dylan","26"));
		return modelAndView;
	}
	
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map){
		System.out.println("testMap");
		map.put("names",Arrays.asList("Dylan","Cathy","Haile"));
		return SUCCESS;
	}
	
	@RequestMapping("/testModel")
	public String testModel(Model model){
		System.out.println("testMap");
//		map.put("names",Arrays.asList("Dylan","Cathy","Haile"));
		model.addAttribute("names",Arrays.asList("Dylan","Cathy","Haile"));
		return SUCCESS;
	}

}
