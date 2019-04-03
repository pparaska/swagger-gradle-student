package com.student.Student.service;

import java.util.ArrayList;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.student.Student.entity.Student;

@Service
public class StudentService {
	ArrayList<Student> students = new ArrayList<Student>();
	private static Logger logger = LoggerFactory.getLogger(StudentService.class);

	public void addNewStudent(Student student) {
		logger.info("Inside addNewStudent method");
		students.add(student);
	}

	public ArrayList<Student> getAllStudents() {
		logger.info("Inside getAllStudents method");
		return students;
	}

	public Student getStudentById(int studentId) {
		logger.info("Inside getStudentById method");
		return students.get(studentId);
	}

	public void updateStudent(int studentId, Student student) {
		logger.info("Inside updateStudent method");
		students.set(studentId, student);
	}

	public void deleteStudent(int employeeId) {
		logger.info("Inside deleteStudent method");
		students.remove(employeeId);
	}
}
