package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	public String add(Customer customer) {
	
		
		try {
			repo.save(customer);
			return "sucess";
		} catch (Exception e) {
			return e.toString();
			// TODO: handle exception
		}
		
	}

}
