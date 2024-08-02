package com.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.User;

@Service
public class UserService {
	
	List<User> list=new ArrayList<>();
	
	public UserService()
	{
		list.add(new User("Tejal","Teju123","Teja@gmail.com"));
		list.add(new User("Pallavi","pallo23","pallo@gmail.com"));
	}
	
	//get all users
	public List<User> getAllUser()
	{
		return this.list;
	}
	
	//get Single user
	public User getUser(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	//Add new User
	public User AddUser(User user)
	{
		this.list.add(user);
		return user;
	}

}
