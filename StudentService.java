package com.s.service;

import com.s.dao.InterfaceDao;

public class StudentService implements InterfaceService{
	private InterfaceDao student;
	@Override
	public void work() {
		student.wrok();
		
	}
	public void setStudent(InterfaceDao student) {
		this.student = student;
	}

	
	

}
