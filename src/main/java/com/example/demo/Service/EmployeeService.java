package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepo repo;
	
	
	@Autowired
	LoginService loginService;
	
	public boolean addEmployee(Employee emp,String role) {
		
	try {
		
		repo.save(emp);
		loginService.saveLogin(emp,role);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<Employee> getAllEMployee(){
		
		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<Employee> getEmpById(long id) {
		
		try {
			return repo.findById(id);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteById(long id) {
		
		try {
			
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
		
	}
	
	
	public int getEmployeeCount() {
		
		try {
			
			return repo.countEmp();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		}
	}
	
	
	
	
	public List<Employee> getByDeapartment(String dep){
		
		try {
			return repo.getDepartment(dep);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

}
	
