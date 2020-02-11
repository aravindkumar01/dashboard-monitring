package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.Dashboard;
import com.example.demo.Service.DashboardService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	DashboardService service;
	
	@GetMapping("/count")
	public Dashboard getAll(){
		
		try {
			
			return service.getAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		
	}
	

}
