package com.shrek.HeroAcademyV2.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.HeroAcademyV2.model.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	@Transactional
	public List<User> getAllUsers() {
		return (List<User>) findAll();
	}

	@Transactional
	public User getUser(Long id) {
		return (User) find(id);
	}

	@Transactional
	public User addUser(User user) {
		return (User) create(user);
	}

	@Transactional
	public User updateUser(User user) {
		return (User) update(user);
	}

	@Transactional
	public void deleteUser(User user) {
		delete(user.getId());
	}

	@Transactional
	public void deleteUser(Long id) {
		delete(id);
	}

}
