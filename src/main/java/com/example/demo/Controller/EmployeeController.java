package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public @ResponseBody boolean newEmployee(@RequestBody Employee emp) {
		
		try {
			
			return service.addEmployee(emp);
		} catch (Exception e) {
			e.printStackTrace();
			return true;
			// TODO: handle exception
		}
	}
	
	
	@GetMapping("/all")
	public List<Employee> getAllEmp(){
		
		try {
			
			return service.getAllEMployee();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	
	
	
	@GetMapping("/{id}")
	public Optional<Employee> getById(@PathVariable("id") long id) {
		try {
			
			return service.getEmpById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	
	
	@DeleteMapping("/{id}")
	public boolean deleteEmp(@PathVariable("id") long id) {
		
		try {
			return service.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
}
