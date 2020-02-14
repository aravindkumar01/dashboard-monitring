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
	
	
	@Column(name="emp_responce")
    private String emp_responce;
	
	@Column(name="department")
    private String department;

	
	@Column(name="date_of_event")
	private String date_of_event;
	
	
	@Column
	private String title;
	
	
	
	
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDate_of_event() {
		return date_of_event;
	}


	public void setDate_of_event(String date_of_event) {
		this.date_of_event = date_of_event;
	}


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


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getEmp_responce() {
		return emp_responce;
	}


	public void setEmp_responce(String emp_responce) {
		this.emp_responce = emp_responce;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}



	

}
