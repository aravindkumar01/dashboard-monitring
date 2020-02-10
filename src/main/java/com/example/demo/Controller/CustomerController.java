package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@Controller
public class CustomerController {
	
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public @ResponseBody String add(@RequestBody Customer customer)
	{
		
		try {
			String result=service.add(customer);
			return result;
			
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
		
	}

}
