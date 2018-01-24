package com.project.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.countries.models.Cities;

@Repository 												
public interface CitiesRepository extends CrudRepository<Cities,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
