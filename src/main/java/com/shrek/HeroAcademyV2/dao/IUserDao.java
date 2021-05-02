package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.User;

import java.util.List;

public interface IUserDao {

	List<User> get();

	User get(int id);

	void save(User employee);

	void delete(int id);
}
