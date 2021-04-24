package com.shrek.HeroAcademyV2.services;

import com.shrek.HeroAcademyV2.to.LoginTO;

public interface IAuthenticationService {

	public Boolean authenticate(LoginTO loginTO);

}
