package com.spring.service;

import java.util.List;

import com.spring.model.User;



public interface UserService {
            
       public User CreateUser(User user);
       public User readUserById(int userId);
       public User readUserByName(String userName);
       public List<User> readAllUsers();
       public User updateUser(User user);
       public User deleteUserById(int userId);
}
