package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repo.DepartmentRepo;

@Service
public class DepartmentService {
	

	@Autowired
	DepartmentRepo repo;
	
	
	
	public boolean add(Department dep) {
		
	try {
		
		repo.save(dep);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<Department> getAll(){
		
		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<Department> getById(long id) {
		
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
