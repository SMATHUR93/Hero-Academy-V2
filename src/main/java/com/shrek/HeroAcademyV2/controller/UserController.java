package com.shrek.HeroAcademyV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shrek.HeroAcademyV2.model.User;
import com.shrek.HeroAcademyV2.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> get() {
		return userService.get();
	}

	@PostMapping("/user")
	public User save(@RequestBody User User) {
		userService.save(User);
		return User;
	}

	@GetMapping("/user/{id}")
	public User get(@PathVariable int id) {
		return userService.get(id);
	}

	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {

		userService.delete(id);

		return "User removed with id " + id;

	}

	@PutMapping("/user")
	public User update(@RequestBody User User) {
		userService.save(User);
		return User;
	}
}