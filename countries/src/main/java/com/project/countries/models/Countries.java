package com.project.countries.models;

import com.project.countries.models.Cities;
import com.project.countries.models.Languages;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Countries{
	@Id
	@GeneratedValue
	private long id;
	private String code;
	private String name;
	private int continent;
	private String region;
	private double surface_area;
	private short indep_year;
	private int population;
	private double life_expectency;
	private double gnp;
	private double gnp_old;
	private String local_name;
	private String goverment_form;
	private String head_of_state;
	private int capital;
	private String code2;

	// Member variables and annotations go here.
		
	@OneToMany(mappedBy="countries", fetch = FetchType.LAZY)
	private List<Languages> languages;
	@OneToMany(mappedBy="countries", fetch = FetchType.LAZY)
	private List<Cities> cities;
	

	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	public void onCreate(){this.createdAt = new Date();}
	@PreUpdate
	public void onUpdate(){this.updatedAt = new Date();}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// Setters and Getters go here
	
	public Countries(){
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the continent
	 */
	public int getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(int continent) {
		this.continent = continent;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the surface_area
	 */
	public double getSurface_area() {
		return surface_area;
	}
	/**
	 * @param surface_area the surface_area to set
	 */
	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}
	/**
	 * @return the indep_year
	 */
	public short getIndep_year() {
		return indep_year;
	}
	/**
	 * @param indep_year the indep_year to set
	 */
	public void setIndep_year(short indep_year) {
		this.indep_year = indep_year;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * @return the life_expectency
	 */
	public double getLife_expectency() {
		return life_expectency;
	}
	/**
	 * @param life_expectency the life_expectency to set
	 */
	public void setLife_expectency(double life_expectency) {
		this.life_expectency = life_expectency;
	}
	/**
	 * @return the gnp
	 */
	public double getGnp() {
		return gnp;
	}
	/**
	 * @param gnp the gnp to set
	 */
	public void setGnp(double gnp) {
		this.gnp = gnp;
	}
	/**
	 * @return the gnp_old
	 */
	public double getGnp_old() {
		return gnp_old;
	}
	/**
	 * @param gnp_old the gnp_old to set
	 */
	public void setGnp_old(double gnp_old) {
		this.gnp_old = gnp_old;
	}
	/**
	 * @return the local_name
	 */
	public String getLocal_name() {
		return local_name;
	}
	/**
	 * @param local_name the local_name to set
	 */
	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	/**
	 * @return the goverment_form
	 */
	public String getGoverment_form() {
		return goverment_form;
	}
	/**
	 * @param goverment_form the goverment_form to set
	 */
	public void setGoverment_form(String goverment_form) {
		this.goverment_form = goverment_form;
	}
	/**
	 * @return the head_of_state
	 */
	public String getHead_of_state() {
		return head_of_state;
	}
	/**
	 * @param head_of_state the head_of_state to set
	 */
	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}
	/**
	 * @return the capital
	 */
	public int getCapital() {
		return capital;
	}
	/**
	 * @param capital the capital to set
	 */
	public void setCapital(int capital) {
		this.capital = capital;
	}
	/**
	 * @return the code2
	 */
	public String getCode2() {
		return code2;
	}
	/**
	 * @param code2 the code2 to set
	 */
	public void setCode2(String code2) {
		this.code2 = code2;
	}
}
