package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Meeting;
import com.example.demo.Entity.MeetingStatus;
import com.example.demo.Repo.MeetingStatusRepo;
import com.example.demo.Repo.MetingRepo;

@Service
public class MeetingService {
	
	
	

	@Autowired
	MetingRepo repo;
	
	
	
	public boolean add(Meeting entity) {
		
	try {
		
		repo.save(entity);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<Meeting> getAll(){
		
		try {
			return repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<Meeting> getById(long id) {
		
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
	
	public long countMeeting() {
		
		try {
			
			return repo.count();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			// TODO: handle exception
		}
	}
	
	
/*********************meeting status***************************/
	
	
	

	
 @Autowired
 MeetingStatusRepo status;
 
	
	
	
	public boolean add(MeetingStatus entity) {
		
	try {
		
		status.save(entity);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
	
	
	}
	

	public List<MeetingStatus> getAllStatus(){
		
		try {
			return status.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

	
	public Optional<MeetingStatus> getStatusById(long id) {
		
		try {
			return status.findById(id);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteStatusById(long id) {
		
		try {
			
			status.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
		
	}
	
	
	

}
