package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByUserId(int userId);

	public User findByUserName(String userName);
	public List<User> findAll();

}
