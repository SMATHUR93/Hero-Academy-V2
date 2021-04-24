package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="LOCATION")
public class Location extends BaseEntity implements Serializable{

	@Column(name="REGION", nullable=true)
	private String region;
	
	@Column(name="COUNTRY", nullable=true)
	private String country;
	
	@Column(name="STATE", nullable=true)
	private String state;
	
	@Column(name="CITY", nullable=true)
	private String city;
	
	@Column(name="AREA", nullable=true)
	private String area;
	
	@Column(name="STREET", nullable=true)
	private String street;
	
	@Column(name="BUILDING", nullable=true)
	private String building;
	
	@Column(name="PIN_CODE", nullable=true)
	private String pinCode;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Location() {
		super();
	}

	public Location(String region, String country, String state, String city, String area, String street,
			String building, String pinCode) {
		super();
		this.region = region;
		this.country = country;
		this.state = state;
		this.city = city;
		this.area = area;
		this.street = street;
		this.building = building;
		this.pinCode = pinCode;
	}
	
}
