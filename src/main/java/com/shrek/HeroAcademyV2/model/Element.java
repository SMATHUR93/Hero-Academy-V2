package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="ELEMENT")
public class Element extends BaseEntity  implements Serializable{

	@Column(name="NAME", nullable=true)
	private String name;
	
	@Column(name="DESCRIPTION", nullable=true)
	private String description;
	
	@Column(name="COLOR", nullable=true)
	private String color;
	
	@Column(name="GOOD_AGAINST", nullable=true)
	private String goodAgainst;
	
	@Column(name="BAD_AGAINST", nullable=true)
	private String badAgainst;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGoodAgainst() {
		return goodAgainst;
	}

	public void setGoodAgainst(String goodAgainst) {
		this.goodAgainst = goodAgainst;
	}

	public String getBadAgainst() {
		return badAgainst;
	}

	public void setBadAgainst(String badAgainst) {
		this.badAgainst = badAgainst;
	}

	public Element() {
		super();
	}

	public Element(String name, String description, String color, String goodAgainst, String badAgainst) {
		super();
		this.name = name;
		this.description = description;
		this.color = color;
		this.goodAgainst = goodAgainst;
		this.badAgainst = badAgainst;
	}
	
}
