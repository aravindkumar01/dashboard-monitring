package com.example.demo.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="media")
public class Media {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="path")
    private String path;
	
	@Column(name="type")
    private String type;
	
	
	@Column(name="meeting_id")
    private Long meeting_id;

	
	@Column(name="file_name")
    private String file_name;
	

	@Column(name="meeting_title")
    private String meeting_title;
	
	
	
	

	public String getMeeting_title() {
		return meeting_title;
	}

	public void setMeeting_title(String meeting_title) {
		this.meeting_title = meeting_title;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public Long getMeeting_id() {
		return meeting_id;
	}

	public void setMeeting_id(Long meeting_id) {
		this.meeting_id = meeting_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
}
