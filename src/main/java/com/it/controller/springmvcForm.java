package com.it.controller;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.it.entities.User;

@Controller
@RequestMapping("/springmvcForm")
public class springmvcForm {
	@RequestMapping(value = "/testForm", method = RequestMethod.POST)
	public String testForm(User user,ModelMap map) {
		System.out.println(user);
		map.addAttribute("user", new User("Dylan", 12));
		return "test";
	}

	@RequestMapping("/initForm")
	public String initForm(ModelMap map) {
		map.addAttribute("user",new User());
		return "test";
	}

}
