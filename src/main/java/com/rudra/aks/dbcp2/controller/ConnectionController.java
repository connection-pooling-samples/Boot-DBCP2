package com.rudra.aks.dbcp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.aks.dbcp2.dao.IUserDAO;
import com.rudra.aks.dbcp2.model.UserDTO;

@RestController
public class ConnectionController {

	
	@Autowired
	IUserDAO	userDao;
	
	@GetMapping("/get/{id}")
	public	String	getUserById(@PathVariable("id") int id) {
		
		UserDTO user = userDao.getUser(id);
		return user.toString();
	}
	
	@GetMapping("/usersCount")
	public	int		usersCount() {
		return userDao.getNoOfUsers();
	}
	
	@GetMapping("/pool")
	public	void	getPoolProperties() {
		userDao.getPoolProperties();
	}
	
}
