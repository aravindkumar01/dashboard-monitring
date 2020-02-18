package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_allownence")
public class Travel {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="project")
    private String project;
	
	
	@Column(name="place_from")
    private String place_from;
	
	@Column(name="place_to")
    private String place_to;
	
	@Column(name="place_amount")
    private String place_amount;
	
	@Column(name="emp_id")
    private String emp_id;
	
	
	@Column(name="admin_status")
    private boolean admin_status;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public String getPlace_from() {
		return place_from;
	}


	public void setPlace_from(String place_from) {
		this.place_from = place_from;
	}


	public String getPlace_to() {
		return place_to;
	}


	public void setPlace_to(String place_to) {
		this.place_to = place_to;
	}


	public String getPlace_amount() {
		return place_amount;
	}


	public void setPlace_amount(String place_amount) {
		this.place_amount = place_amount;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public boolean isAdmin_status() {
		return admin_status;
	}


	public void setAdmin_status(boolean admin_status) {
		this.admin_status = admin_status;
	}
	
	
	
	
	
	

}
