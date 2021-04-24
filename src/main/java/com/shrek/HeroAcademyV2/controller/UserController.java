package com.shrek.HeroAcademyV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.HeroAcademyV2.model.User;
import com.shrek.HeroAcademyV2.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> get() {
		return userService.get();
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User save(@RequestBody User User) {
		userService.save(User);
		return User;
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User get(@PathVariable int id) {
		return userService.get(id);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		userService.delete(Long.valueOf(id));
		return "User removed with id " + id;
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public User update(@RequestBody User User) {
		userService.save(User);
		return User;
	}
}