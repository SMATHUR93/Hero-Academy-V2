package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="COURSE_INSTRUCTOR")
public class CourseInstructor extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
	private Course courseId;
	
	@Column(name="SLOT", nullable=true)
	private String slot;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public CourseInstructor() {
		super();
	}

	public CourseInstructor(User userId, Course courseId, String slot) {
		super();
		this.userId = userId;
		this.courseId = courseId;
		this.slot = slot;
	}
	
}
