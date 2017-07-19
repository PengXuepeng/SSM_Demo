package com.it.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.it.dao.AddressDAO;
import com.it.entities.Employee;
import com.it.services.EmployeeService;
@Controller
@RequestMapping("/springmvc")
public class SpringMVC_CUID {
	@Autowired
	private EmployeeService employeeService; 
	@Autowired
	private AddressDAO addressDao;
//	@ModelAttribute
//	public void modelAttribute(@RequestParam(value="id",required=false) Integer id,Map<String,Employee> map){
//		System.out.println("modelAttribute init ...");
//		if(id != null){
//			System.out.println("modelAttribute run ...");
//			map.put("employee", employeeService.getEmployee(id));
//		}
//		
//	}
	
	@RequestMapping(value="/getEmployees",method=RequestMethod.GET)
	public ModelAndView getEmployees(ModelAndView mv){
		System.out.println("getEmployees: "+employeeService.getEmployees());
		mv.addObject("employees", employeeService.getEmployees());
		mv.setViewName("getEmployees");
		return mv;
	}
	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public String getFormEmployee(Map<String, Object> map){
		map.put("address", addressDao.getAdress());
		map.put("employee", new Employee());
		Map<String, String> genders = new HashMap();
		genders.put("1", "Male");
		genders.put("0", "Female");
		map.put("genders", genders);
		return "addEmployee";	
	}
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public ModelAndView addEmployee(Employee employee,ModelAndView mv){
		Boolean response_add = employeeService.addEmployee(employee);
		System.out.println("addEmployee: "+response_add);
		mv.addObject("response_add", response_add);
		mv.setViewName("addEmployee");
		return mv;	
	}
	@RequestMapping(value="/updateEmployee",method=RequestMethod.PUT)
	public ModelAndView updateEmployee(Employee employee,ModelAndView mv){
		Boolean response_update = employeeService.updateEmployee(employee);
		System.out.println("updateEmployee: "+response_update);
		mv.addObject("response_update", response_update);
		mv.setViewName("updateEmployee");
		return mv;
	}
	@RequestMapping(value="/removeEmployee/{id}",method=RequestMethod.DELETE)
	public ModelAndView removeEmployee(@PathVariable Integer id,ModelAndView mv){
		Boolean response_remove = employeeService.removeEmployee(id);
		System.out.println("removeEmployee: "+response_remove);
		mv.addObject("response_remove", response_remove);
		mv.setViewName("removeEmployee");
		return mv;
	}

}
