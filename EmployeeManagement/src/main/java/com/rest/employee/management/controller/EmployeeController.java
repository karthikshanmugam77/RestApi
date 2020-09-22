package com.rest.employee.management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.management.model.Employee;

@RestController
public class EmployeeController {
	
	List< Employee > EmpList = new ArrayList<>();
	
	
	public EmployeeController() {
		init();
	}
	public void init()
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("karthi");
		EmpList.add(e1);
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("gowtham");
		EmpList.add(e2);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return EmpList;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(Employee employee) {
		EmpList.add(employee);
		return employee;
	}
	
	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable("id") Integer id) {
		
		Employee  e1 = null;
		for (Employee employee2 : EmpList) {
			Integer id2 = employee2.getId();
			if(id2==id)
			{
				e1 = employee2;
			}
		}
		return e1;
	}
	
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable("id")  Integer id) {
		
		Employee employee = EmpList.get(id);
		System.out.println("hi");
		EmpList.remove(employee);
	}
	
	

}
