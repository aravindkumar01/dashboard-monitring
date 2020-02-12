package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meeting")
public class Meeting {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="title")
    private String title;
	
	
	
	@Column(name="dep_id")
    private long dep_id;
	
	@Column(name="dep_name")
    private String dep_name;
	
	@Column
    private String notes;
	
	@Column
    private String status;
	
	@Column
    private String date_of_event;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate_of_event() {
		return date_of_event;
	}

	public void setDate_of_event(String date_of_event) {
		this.date_of_event = date_of_event;
	}
	
	
	
	

}
