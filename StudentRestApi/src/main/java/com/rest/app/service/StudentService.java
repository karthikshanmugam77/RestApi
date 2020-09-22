package com.rest.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.app.entity.Student;

@Service
public class StudentService {
	private List<Student> students;

	public StudentService() {
		students = new ArrayList<>(Arrays.asList(new Student(1, "karthi"), new Student(2, "gowtham")));

	}

	public void addStudent(Student s1) {
		students.add(s1);
	}

	public List<Student> getAllStudents() {
		return students;
	}
	public Student getStudentById( int id) {
		for (Student student : students) {
			if(student.getStudentId() == id) {
				return student;
			}
		}
		return null;
	}

}
