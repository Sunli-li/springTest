package com.s.servlet;

import com.s.service.InterfaceService;

public class StudentServlet {
	private InterfaceService stuServlet;
	
	public void service(){
		stuServlet.work();
	}
	public void setStuServlet(InterfaceService stuServlet) {
		this.stuServlet = stuServlet;
	}
	
	

}
