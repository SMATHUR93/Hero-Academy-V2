package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TEAM")
public class Team extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "MISSION_ID", referencedColumnName = "ID")
	private Mission missionId;
	
	@Column(name="ROLE", nullable=true)
	private String role;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Mission getMissionId() {
		return missionId;
	}

	public void setMissionId(Mission missionId) {
		this.missionId = missionId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Team() {
		super();
	}

	public Team(User userId, Mission missionId, String role) {
		super();
		this.userId = userId;
		this.missionId = missionId;
		this.role = role;
	}
	
}
