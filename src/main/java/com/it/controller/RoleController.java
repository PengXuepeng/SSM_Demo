package com.it.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.it.entities.Role;
import com.it.services.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService = null;

	@RequestMapping("/getRolebyId")
	@ResponseBody
	public Role getRole(@RequestParam("id") int id) {

		long start = System.currentTimeMillis();
		Role role = this.roleService.getRole(id);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		return role;
	}

	@RequestMapping("/addRole")
	@ResponseBody
	public Role addRole() {
		Role role = new Role();
		role.setRoleName("Dylan");
		role.setCreateDate(new Date());
		this.roleService.insertRole(role);
		return role;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView testModelAndView(ModelAndView modelAndView) {
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
