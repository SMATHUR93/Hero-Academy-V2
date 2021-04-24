package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "MISSION")
public class Mission extends BaseEntity implements Serializable{

	@Column(name="NAME", nullable=true)
	private String name;
	
	@Column(name="OBJECTIVE", nullable=true)
	private String objective;
	
	@Column(name="START_DATE", nullable=true)
	private Date startDate;
	
	@Column(name="END_DATE", nullable=true)
	private Date endDate;
	
	@OneToOne
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "ID")
	private Location locationId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Location getLocationId() {
		return locationId;
	}

	public void setLocationId(Location locationId) {
		this.locationId = locationId;
	}

	public Mission() {
		super();
	}

	public Mission(String name, String objective, Date startDate, Date endDate, Location locationId) {
		super();
		this.name = name;
		this.objective = objective;
		this.startDate = startDate;
		this.endDate = endDate;
		this.locationId = locationId;
	}
	
}
