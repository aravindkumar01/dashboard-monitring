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
    private boolean status;
	
	@Column(name="notes")
    private String notes;
	
	
	@Column(name="emp_responce")
    private boolean emp_responce;
	
	@Column(name="department")
    private String department;

	
	@Column(name="date_of_event")
	private String date_of_event;
	
	
	@Column
	private String title;
	
	@Column
	private long dep_id;

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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isEmp_responce() {
		return emp_responce;
	}

	public void setEmp_responce(boolean emp_responce) {
		this.emp_responce = emp_responce;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDate_of_event() {
		return date_of_event;
	}

	public void setDate_of_event(String date_of_event) {
		this.date_of_event = date_of_event;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}
	
	
	

}
