package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Login;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.LoginService;

@SpringBootApplication
public class SpringBootDemo extends  SpringBootServletInitializer {

	@Autowired
	static EmployeeService service;
	
	@Autowired
	static LoginService login1;
	
	
	public static void main(String[] args) {
//		/createLogin();
		SpringApplication.run(SpringBootDemo.class, args);
		
	}

	public  static void createLogin() {
		try {

			List<Login> login=login1.getAll();
			System.out.println("--------login---"+login);
			if(login!=null) {
				Employee emp=new Employee();		
				  emp.setEmail("admin@gmail.com");
				  emp.setFirst_name("admin");
				  emp.setLast_name("admin");			  
				  emp.setGender("male");
				  service.addEmployee(emp, "admin");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}

 

