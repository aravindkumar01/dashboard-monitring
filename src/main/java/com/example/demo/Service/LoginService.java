package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Login;
import com.example.demo.Repo.LoginRepo;

@Service
public class LoginService {

	
	@Autowired
	LoginRepo repo;
	
	
	public boolean saveLogin(Employee emp,String role) {
		
		try {
			
			Login l=new Login();
			
			l.setUsername(emp.getEmail());
			l.setPassword(emp.getEmail());
			l.setRole(role);
			repo.save(l);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
	
	
	
	public Login checkLogin(Login l) {
		try {
			Login log=null;
			if(l.getUsername().equalsIgnoreCase("admin@gmail.com") && l.getPassword().equalsIgnoreCase("admin@gmail.com")) {
				
			  log=new Login();
				  log.setUsername(l.getUsername());
				  log.setPassword(l.getPassword());
				  log.setRole("admin");
			}else {
				 log=repo.login(l.getUsername(), l.getPassword());
			}
			
			
			if(log!=null) {
				return log;
			}
			return null;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<Login> getAll(){
		
		
		try {
			
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	
}
