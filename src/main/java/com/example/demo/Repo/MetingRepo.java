package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Meeting;

@Repository
public interface MetingRepo extends JpaRepository<Meeting, Long>{

	//@Query("select count(m) Meeting m")
	//long getMeeting();
	
	long count();
}
