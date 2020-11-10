package com.s.text;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.s.dao.InterfaceDao;
import com.s.dao.Student;
import com.s.service.InterfaceService;
import com.s.service.StudentService;
import com.s.servlet.StudentServlet;

public class Text1 {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("context/beans.xml");
		/*Student stu=con.getBean("stu",Student.class);
		stu.work();
		
		InterfaceDao inter=con.getBean("stu",InterfaceDao.class);
		inter.wrok();
		
		InterfaceService stuSer=con.getBean("stuService",InterfaceService.class);
		stuSer.work();*/
		
		StudentServlet studentServlet =con.getBean("studentServlet",StudentServlet.class);
		studentServlet.service();
	}

}
