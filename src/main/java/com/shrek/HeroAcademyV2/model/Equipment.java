package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="EQUIPMENT")
public class Equipment extends BaseEntity implements Serializable{

	@Column(name="NAME", nullable=true)
	private String name;
	
	@Column(name="DESCRIPTION", nullable=true)
	private String description;
	
	@Column(name="LEVEL", nullable=true)
	private Integer level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Equipment() {
		super();
	}

	public Equipment(String name, String description, Integer level) {
		super();
		this.name = name;
		this.description = description;
		this.level = level;
	}
	
}
