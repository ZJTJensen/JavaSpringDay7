package com.project.countries.repositories;

import com.project.countries.models.Countries;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface CountriesRepository extends CrudRepository<Countries,Long>{
	// Query methods go here.
	@Query(value="SELECT countries.name, languages.language, languages.percentage FROM countries JOIN languages ON countries.id = languages.country_id WHERE language = ?1 ORDER BY languages.percentage DESC", nativeQuery=true)
	List<Object> findCountriesByLanguage(String language);
	
	@Query(value="SELECT countries.name, COUNT(cities.id) FROM countries JOIN cities ON countries.id = cities.country_id GROUP BY countries.name ORDER BY COUNT(cities.id) DESC", nativeQuery=true)
	List<Object> findCitiesInCountries();

	@Query(value="SELECT WHERE countries.name = ?1, countries.cities FROM countries JOIN cities ON countries.id = cities.country_id  WHERE population= ?2 ORDER BY DESC", nativeQuery=true)
	List<Object> findCitiesWithNum(String country, int num);


	@Query(value="SELECT countries.name FROM countries JOIN languages ON countries.id = languages.country_id  WHERE percentage= ?1 ORDER BY COUNT(languages.id) DESC", nativeQuery=true)
	List<Object> findLanguageInCountries(double language);

	// Example:
	// public YourModelHere findByName(String name);
}
