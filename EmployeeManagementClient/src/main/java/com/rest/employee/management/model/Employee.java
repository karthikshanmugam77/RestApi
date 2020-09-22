package com.rest.employee.management.model;

public class Employee {
	private Integer id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
