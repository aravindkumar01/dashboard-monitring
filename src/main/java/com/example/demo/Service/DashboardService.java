package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Dashboard;

@Service
public class DashboardService {
	
	@Autowired
	DepartmentService dep;
	
	@Autowired
	EmployeeService emp;
	
	
	@Autowired
	MeetingService meetingSer;
	
	public Dashboard getAll(){
		
		try {
			int meeting=meetingSer.countMeeting();
			int employees=emp.getEmployeeCount();
			int department=dep.depCount();
			
			Dashboard dash=new Dashboard();
			dash.setMeeting(meeting);
			dash.setEmployees(employees);
			dash.setDepartments(department);
			
			return dash;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		
		
	}

}
