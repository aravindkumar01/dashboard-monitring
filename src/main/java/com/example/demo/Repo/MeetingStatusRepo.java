package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.MeetingStatus;

@Repository
public interface MeetingStatusRepo extends JpaRepository<MeetingStatus, Long>{

}
