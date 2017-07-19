package com.it.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.EmployeeDAO;
import com.it.entities.Employee;
import com.it.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Boolean addEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public Boolean removeEmployee(Integer id) {
		
		// TODO Auto-generated method stub
		return employeeDAO.removeEmployee(id);
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(id);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

	

}
