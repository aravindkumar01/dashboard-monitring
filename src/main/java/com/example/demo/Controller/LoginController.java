package com.example.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Login;
import com.example.demo.Service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService service;
	
	
	@GetMapping("/get")
	public @ResponseBody Login chceckLogin(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session) {
		
	
		
		try {
			
			Login login =new Login();
			   login.setPassword(password);
			   login.setUsername(username);
			Login l=service.checkLogin(login);
			if(l!=null) {
				//System.out.println(login.getUsername()+"---------"+login.getRole());
				session.setAttribute("user", l);
				return l;
			}
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@GetMapping("/menu")
	public  ModelAndView menu(ModelMap model,HttpSession session){
		
	
		
		try {
			Login l=(Login)session.getAttribute("user");
			
		System.out.println(l.getUsername()+"---------"+l.getRole());
			model.addAttribute("userType",l.getRole());
			//model.addObject("employeeObj", new EmployeeBean(123));
			//model.addObject("msg", "Employee information.");
			return new ModelAndView("menu");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
