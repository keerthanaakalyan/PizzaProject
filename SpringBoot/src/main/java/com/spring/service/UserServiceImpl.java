package com.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserRepository;
import com.spring.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
    @Transactional
	public User CreateUser(User user) {
		return this.userRepository.save(user);
	}

	public User readUserById(int userId) {
		return this.userRepository.findByUserId(userId);
	}

	public User readUserByName(String userName) {
		return this.readUserByName(userName);
	}

	public List<User> readAllUsers() {
		return this.userRepository.findAll();
	}
	   @Transactional
	public User updateUser(User user) {
		return this.userRepository.save(user);
	}
	   @Transactional
	public User deleteUserById(int userId) {
		   User user=this.userRepository.findByUserId(userId);
		   this.userRepository.deleteById(userId);
		   return user;
	}

}
