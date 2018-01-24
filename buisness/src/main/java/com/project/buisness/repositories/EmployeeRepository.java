package com.project.buisness.repositories;

import com.project.buisness.models.Employee;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
