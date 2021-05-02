package com.shrek.HeroAcademyV2.services;

import com.shrek.HeroAcademyV2.model.User;

import java.util.List;

public interface IUserService {
	List<User> get();

	User get(int id);

	void save(User user);

	void delete(User user);

	void delete(Long id);
}