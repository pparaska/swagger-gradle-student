package com.student.Student.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student.entity.Student;
import com.student.Student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentResource {

	@Autowired
	StudentService service;
	
	@GetMapping
	public ArrayList<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	
	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable Integer studentId){
		return service.getStudentById(studentId);
	}
	
	
	@PostMapping
	public void addNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		service.updateStudent(student.getStudentId(), student);
	}
	
	@DeleteMapping("/{studentId}")
	public void deleteStudent(@PathVariable Integer studentId) {
		service.deleteStudent(studentId);
	}
}
