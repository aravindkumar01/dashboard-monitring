package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Login;
import com.example.demo.Service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService service;
	
	
	@GetMapping("/get")
	public @ResponseBody Login chceckLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		
	
		
		try {
			
			Login login =new Login();
			   login.setPassword(password);
			   login.setUsername(username);
			Login l=service.checkLogin(login);
			if(l!=null) {
				return l;
			}
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
