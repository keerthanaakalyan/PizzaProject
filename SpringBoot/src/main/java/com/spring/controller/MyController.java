package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;


@RestController
public class MyController {
	@Autowired
	UserService userService;
	 @PostMapping(value="/createuser")
	 public String welcome(@RequestBody User user,Model m){
		 if(this.userService.CreateUser(user)!=null){
		 m.addAttribute("user", user.getUserName());
		 return "welcome";
		 }else{
			 return "failure";
		 }
	 }
	 @GetMapping(value="/readuserbyid/{id}")
	 public User readById(@PathVariable("id") int userId){
		 return this.userService.readUserById(userId);
	 }
	 @GetMapping(value="/readuserbyname/{name}")
	 public User readByName(@PathVariable("name") String userName){
		 return this.userService.readUserByName(userName);
	 }
	 @GetMapping(value="/readallusers")
	 public List<User> readAll(){
		 return this.userService.readAllUsers();
	 }
	 @PutMapping(value="/")
	 public List<User> update(){
		 return this.userService.readAllUsers();
	 }
	 @DeleteMapping(value="/deletebyid/{id}")
	 public User deletebyid(@PathVariable("id") int userId){
		 return this.userService.deleteUserById(userId);
	 }
	 

}
