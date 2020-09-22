package com.rest.employee.client;

import java.util.HashMap;

import org.springframework.web.client.RestTemplate;

import com.rest.employee.management.model.Employee;

public class EmployeeRestClient {
	
	public static void main(String[] args) {
		
		RestTemplate template = new RestTemplate();
		
		
		Employee forObject = template.getForObject("http://localhost:8085/employees/1", Employee.class);
		System.out.println("1 - " + forObject);
		
		
		Employee postForObject = template.postForObject("http://localhost:8085/employees", new Employee(3,"karthi"), Employee.class);
		System.out.println(postForObject);
		
//		HashMap <String , String> params = new HashMap<String, String>(); 
//		params.put("id", "0");
//		template.delete("http://localhost:8085/employees/{id}" ,params );
		
	}

}
