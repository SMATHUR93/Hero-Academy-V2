package com.shrek.HeroAcademyV2.services;

import java.util.List;

import com.shrek.HeroAcademyV2.model.User;

public interface IUserService {
	List<User> get();

	User get(long id);

	void save(User user);

	void delete(User user);

	void delete(Long id);
}