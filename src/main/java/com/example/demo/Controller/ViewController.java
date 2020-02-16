package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	
	@RequestMapping("/")
	public String loginMessage(){
		return "login";
	}
	
	@RequestMapping("/employeeDetails")
	public String employeeDetails(){
		return "employeeDetails";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(){
		return "addemployee";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartment(){
		return "addDepartment";
	}
	
	
	@RequestMapping("/departmentDetails")
	public String departmentDetails(){
		return "departmentDetails";
	}
	
	
	@RequestMapping("/addMeeting")
	public String addMeeting(){
		return "addMeeting";
	}
	
	
	@RequestMapping("/meetingDetails")
	public String meetingDetails(){
		return "meetingDetails";
	}
	
	@RequestMapping("/meetingStatus")
	public String meetingStatus(){
		return "meetingStatus";
	}

	

	@RequestMapping("/employeeMeetingStatus")
	public String employeeMeetingStatus(){
		return "employeeMeetingStatus";
	}
	
	
	@RequestMapping("/employeeTravel")
	public String employeeTravel(){
		return "employeeTravel";
	}

}
