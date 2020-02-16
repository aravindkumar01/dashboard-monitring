package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee_travel")
public class Travel {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="project")
    private String project;
	
	
	@Column(name="from")
    private String from;
	
	
	@Column(name="to")
    private String to;
	
	@Column(name="amount")
    private String amount;
	

	
	@Column(name="emp_id")
    private String emp_id;
	
	
	@Column(name="admin_status")
    private boolean admin_status=false;


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


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
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
