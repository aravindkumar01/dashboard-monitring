package com.example.demo.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Travel;

@Repository
public interface TravelRepo extends JpaRepository<Travel, Long>{

	
	@Transactional
	@Modifying
	@Query("update Travel t set t.admin_status=:status1 where t.id=:id")
	void updateStatus(Long id, boolean status1);
	

}
