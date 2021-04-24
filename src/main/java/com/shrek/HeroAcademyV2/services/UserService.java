package com.shrek.HeroAcademyV2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.HeroAcademyV2.dao.IUserDao;
import com.shrek.HeroAcademyV2.model.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Transactional
	@Override
	public List<User> get() {
		return userDao.getAllUsers();
	}

	@Transactional
	@Override
	public User get(long id) {
		return userDao.getUser(id);
	}

	@Transactional
	@Override
	public void save(User user) {
		userDao.addUser(user);

	}

	@Transactional
	@Override
	public void delete(User user) {
		userDao.deleteUser(user);

	}

	@Transactional
	@Override
	public void delete(Long id) {
		userDao.deleteUser(id);

	}
}