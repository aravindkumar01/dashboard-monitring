package com.example.demo.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.MeetingStatus;

@Repository
public interface MeetingStatusRepo extends JpaRepository<MeetingStatus, Long>{
	
	
	@Query("select m from  MeetingStatus m where m.dep_id=:dep_id")
	List<MeetingStatus> getStatusDep(long dep_id);
	
	 @Transactional
	@Modifying
   @Query("update MeetingStatus  set status=:status where id=:id")	
   void updateStatus(Long id,boolean status);
   
	 @Transactional
	@Modifying
   @Query("update MeetingStatus  set emp_responce=:status where id=:id")	
   void updateStatusEmp(Long id,boolean status);

	 @Query("select m from  MeetingStatus m where m.emp_id=:emp_id")
	List<MeetingStatus> getListEmp(String emp_id);
}
