package com.rest.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.app.entity.Student;
import com.rest.app.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public void addStudent(Student s1) {
		studentService.addStudent(s1);
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathParam("id") int id) {
		return studentService.getStudentById(id);
	}

}
