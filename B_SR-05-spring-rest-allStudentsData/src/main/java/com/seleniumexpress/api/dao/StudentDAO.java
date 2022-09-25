package com.seleniumexpress.api.dao;

import java.util.List;

import com.seleniumexpress.api.Student;

public interface StudentDAO {
	
	List<Student> getAllStudent();
	Student getStudentDataById(int id);
	Student getStudentDataByName(String name);
	Student saveStudentData(Student student);
	int findStudentListSize();
	Student updateStudent(int id,Student student);
	Student deleteStudent(int id);

}
