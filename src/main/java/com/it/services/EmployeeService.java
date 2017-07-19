package com.it.services;

import java.util.List;

import com.it.entities.Employee;
import com.it.entities.User;

public interface EmployeeService {

	public Boolean addEmployee(Employee employee);

	public Boolean removeEmployee(Integer id);

	public Boolean updateEmployee(Employee employee);

	public Employee getEmployee(Integer id);

	public List<Employee> getEmployees();

}
