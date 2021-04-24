package com.shrek.HeroAcademyV2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="COURSE_USER")
public class CourseUser extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
	private Course courseId;

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

	public CourseUser() {
		super();
	}

	public CourseUser(User userId, Course courseId) {
		super();
		this.userId = userId;
		this.courseId = courseId;
	}
	
}
