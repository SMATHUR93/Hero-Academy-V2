package com.shrek.HeroAcademyV2.web.response;

import com.shrek.HeroAcademyV2.model.AccessToken;

public class LoginResponse extends BasicRestResponse {

	private AccessToken accessToken;

	public AccessToken getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(AccessToken accessToken) {
		this.accessToken = accessToken;
	}

	public LoginResponse() {
		super();
	}

	public LoginResponse(String message, Boolean success) {
		super(message, success);
	}

	public LoginResponse(String message, Boolean success, AccessToken accessToken) {
		super(message, success);
		this.accessToken = accessToken;
	}

}
