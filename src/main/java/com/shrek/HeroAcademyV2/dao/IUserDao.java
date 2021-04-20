package com.shrek.HeroAcademyV2.dao;

import java.util.List;

import com.shrek.HeroAcademyV2.model.User;

public interface IUserDao {

	List<User> get();

	User get(int id);

	void save(User employee);

	void delete(int id);
}
