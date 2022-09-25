package com.seleniumexpress.api.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.seleniumexpress.api.Student;

@Component
public class StudentDAOImpl implements StudentDAO{
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	@PostConstruct
	public void SetUpStudents()
	{
		studentList.add(new Student(1, "Lavanya", "US"));
		studentList.add(new Student(2, "Supriya", "India"));
		studentList.add(new Student(3, "Akhil", "us"));
		studentList.add(new Student(4, "Priya", "India"));
		studentList.add(new Student(5, "Balu", "India"));
	}

	public List<Student> getAllStudent() {
		
		//write the Actual Logic to fetch data from the database
		return studentList;
	}

	public Student getStudentDataById(int id) {
		
		Student student = studentList.get(--id);
		return student;
	}

	public Student getStudentDataByName(String name) {
		
		Student student = null;
		for(Student tempStudent : studentList) {
			if(tempStudent.getName().equals(name))
				return tempStudent;
				
		}
		
		return student;
	}

	public Student saveStudentData(Student student) {
		studentList.add(student);
		return null;
	}

	public int findStudentListSize() {
		studentList.size();
		return studentList.size();
	}

	public Student updateStudent(int id, Student student) {
		
		Student stud = studentList.get(id--);
		stud.setName(student.getName());
		stud.setCountry(student.getCountry());
		
		return stud;
	}

	public Student deleteStudent(int id) {
		
		studentList.remove(id);
		return null;
	}

}
