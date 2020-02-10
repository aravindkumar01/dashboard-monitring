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

}
