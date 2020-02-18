package com.example.demo.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Media;
import com.example.demo.Repo.MediaRepo;

@Service
public class MediaService {
	
	

	
	@Autowired
	MediaRepo repo;
	
	public boolean add(Media entity) {
		
	try {
		
		System.out.println("-------------------"+entity.getPath());
		
		File source = new File(entity.getPath());
		File dest = new File("/Desktop/new folder/Eclipse/dashboard");
		try {
		    FileUtils.copyDirectory(source, dest);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		
		
		repo.save(entity);
		
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<Media> getAll(){
		
		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<Media> getById(long id) {
		
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
