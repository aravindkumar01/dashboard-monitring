package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Meeting;
import com.example.demo.Entity.MeetingStatus;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Repo.MeetingStatusRepo;
import com.example.demo.Repo.MetingRepo;

@Service
public class MeetingService {
	
	
	
 
	@Autowired
	MetingRepo repo;
	
	@Autowired
	EmployeeRepo empRepo;
	
	public boolean add(Meeting entity) {
		
	try {
		
		repo.save(entity);
		addEmpMeet(entity);
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
	
	private boolean addEmpMeet(Meeting entity) {
		
		try {
			
			List<Employee> list=empRepo.getDepartment(entity.getDep_name());
			
			
			for(Employee emp:list) {
				MeetingStatus status=new MeetingStatus();
				      	status.setDepartment(entity.getDep_name());
				      	status.setEmp_id(emp.getEmail());
				      	status.setStatus(false);
				      	status.setEmp_responce(false);
				      	status.setNotes(entity.getNotes());
				      	status.setDate_of_event(entity.getDate_of_event());
				      	status.setTitle(entity.getTitle());
				        status.setDep_id(entity.getDep_id());
				
				add(status);
			}
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
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

	
	public List<MeetingStatus> getStatusById(long id) {
		
		try {
			return status.getStatusDep(id);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	

	
	public Boolean  updateStatus(Long id,boolean status1){
		
		try {
			status.updateStatus(id,status1);
			
			return true;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	

	public Boolean  updateStatusEmp(long id,boolean status1){
		
		try {
			status.updateStatusEmp(id,status1);
			
			return true;
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


	public List<MeetingStatus> getStatusByEmp(String emp_id) {
		
		try {
			
			return status.getListEmp(emp_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	
	
	

}
