package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MeetingStatus")
public class MeetingStatus {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="emp_id")
    private String emp_id;
	
	
	@Column(name="status")
    private String status;
	
	@Column(name="notes")
    private String notes;
	
	
	@Column(name="responce")
    private String responce;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getResponce() {
		return responce;
	}


	public void setResponce(String responce) {
		this.responce = responce;
	}
	

}
