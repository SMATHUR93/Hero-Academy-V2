package com.shrek.HeroAcademyV2.web.response;

public class BasicRestResponse {

	private String message;
	private Boolean success;

	public String getMessage() {
		return this.message;
	}

	public void setErrorMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public BasicRestResponse(String message, Boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public BasicRestResponse() {
		super();
	}
	
}
