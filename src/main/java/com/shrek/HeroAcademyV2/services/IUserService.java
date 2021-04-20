package com.shrek.HeroAcademyV2.services;

import java.util.List;

import com.shrek.HeroAcademyV2.model.User;

public interface IUserService {
	List<User> get();

	User get(int id);

	void save(User employee);

	void delete(int id);
}