package com.shrek.HeroAcademyV2.services;

import com.shrek.HeroAcademyV2.dao.IUserDao;
import com.shrek.HeroAcademyV2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Transactional
	@Override
	public List<User> get() {
		return userDao.get();
	}

	@Transactional
	@Override
	public User get(int id) {
		return userDao.get((id));
	}

	@Transactional
	@Override
	public void save(User user) {
		userDao.save(user);

	}

	@Transactional
	@Override
	public void delete(User user) {
		userDao.delete(Integer.getInteger(Long.toString(user.getId())));

	}

	@Transactional
	@Override
	public void delete(Long id) {
		userDao.delete(Integer.getInteger(Long.toString(id)));

	}
}