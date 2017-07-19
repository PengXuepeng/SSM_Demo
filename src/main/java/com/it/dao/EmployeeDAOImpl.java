package com.it.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.it.entities.Address;
import com.it.entities.Employee;
import com.it.entities.User;

@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	public static List<Employee> employees = new LinkedList<>();
	static{
		Employee e1 = new Employee(1,"Dylan", 0, new Address(1,"JS","XZ"));
		Employee e2 = new Employee(2,"Cathy", 1, new Address(2,"ZJ","HZ"));
		Employee e3 = new Employee(3,"Haile", 1, new Address(3,"GX","GL"));
		Employee e4 = new Employee(4,"Dean", 0, new Address(4,"FJ","PT"));
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		employees.add(employee);
		return true;
	}

	@Override
	public Boolean removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		employees.remove(id);
		return true;
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		employees.add(employee);
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employees.get(id);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

}
