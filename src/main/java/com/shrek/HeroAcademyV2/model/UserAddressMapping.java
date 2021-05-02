package com.shrek.HeroAcademyV2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name="USER_ADDRESS_MAPPING")
public class UserAddressMapping extends BaseEntity implements Serializable{

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	@JsonIgnoreProperties("addresses")
	@LazyCollection(LazyCollectionOption.FALSE)
	private User user;
	
	@OneToOne
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "ID")
	private Location location;
	
	@Column(name="IS_CURRENT_ADDRESS", nullable=true)
	private String isCurrentAddress;
	
	@Column(name="START_DATE", nullable=true)
	private Date startDate;
	
	@Column(name="END_DATE", nullable=true)
	private Date endDate;

	public User getUser() {
		return user;
	}

	public void setUserId(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getIsCurrentAddress() {
		return isCurrentAddress;
	}

	public void setIsCurrentAddress(String isCurrentAddress) {
		this.isCurrentAddress = isCurrentAddress;
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

	public UserAddressMapping() {
		super();
	}

	public UserAddressMapping(User user, Location location, String isCurrentAddress, Date startDate, Date endDate) {
		super();
		this.user = user;
		this.location = location;
		this.isCurrentAddress = isCurrentAddress;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
