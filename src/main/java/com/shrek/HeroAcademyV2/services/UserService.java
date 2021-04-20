package com.shrek.HeroAcademyV2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.HeroAcademyV2.dao.UserDao;
import com.shrek.HeroAcademyV2.model.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public List<User> get() {
		return userDao.get();
	}

	@Transactional
	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Transactional
	@Override
	public void save(User user) {
		userDao.save(user);

	}

	@Transactional
	@Override
	public void delete(int id) {
		userDao.delete(id);

	}
}