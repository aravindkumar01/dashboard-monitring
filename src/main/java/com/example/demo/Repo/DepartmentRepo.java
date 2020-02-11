package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	@Query("select count(d) from Department d")
	int getDepCount();
}
