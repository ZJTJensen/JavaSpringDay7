package com.project.countries.services;

import com.project.countries.repositories.CitiesRepository;
import com.project.countries.repositories.CountriesRepository;
import com.project.countries.repositories.LanguagesRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

	private CountriesRepository _cr;
	private LanguagesRepository _lr;
	private CitiesRepository _citr;
	
	//Injecting repository dependencies through constructor
	public ApiService(CountriesRepository _cr, LanguagesRepository _lr, CitiesRepository _citr) {
		super();
		this._cr = _cr;
		this._lr = _lr;
		this._citr = _citr;
	}
	
	public List<Object> getCountriesByLanguage(String language) {
		return _cr.findCountriesByLanguage(language);
	}
	
	public List<Object> getCitiesInCountries() {
		return _cr.findCitiesInCountries();
	}
	
	// Crud methods to act on services go here.
}
