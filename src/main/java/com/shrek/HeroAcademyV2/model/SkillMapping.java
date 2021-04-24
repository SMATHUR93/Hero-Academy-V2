package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="SKILL_MAPPING")
public class SkillMapping extends BaseEntity implements Serializable{

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	@JsonIgnoreProperties("skills")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "SKILL_ID", referencedColumnName = "ID")
	private Skill skill;
	
	@Column(name="SKILL_LEVEL", nullable=true)
	private Integer skillLevel;

	public User getUser() {
		return user;
	}

	public void setUserId(User user) {
		this.user = user;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	public SkillMapping() {
		super();
	}

	public SkillMapping(User user, Skill skill, Integer skillLevel) {
		super();
		this.user = user;
		this.skill = skill;
		this.skillLevel = skillLevel;
	}
	
}
