package com.project.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.countries.models.Languages;

@Repository 												
public interface LanguagesRepository extends CrudRepository<Languages,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
