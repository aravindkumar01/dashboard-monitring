package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Travel;
import com.example.demo.Repo.TravelRepo;

@Service
public class TravelService {

	

	@Autowired
	TravelRepo repo;
	
	public boolean add(Travel entity) {
		
	try {
		
		repo.save(entity);
		
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<Travel> getAll(){
		
		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<Travel> getById(long id) {
		
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
}
