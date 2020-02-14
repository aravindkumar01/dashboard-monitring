package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Long>{

	@Query("select count(e) from Employee e")
	int countEmp();
	
	@Query("select d from Employee d where d.department=:name")
	List<Employee> getDepartment(String name);
}
