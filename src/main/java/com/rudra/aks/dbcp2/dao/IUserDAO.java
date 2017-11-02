package com.rudra.aks.dbcp2.dao;

import com.rudra.aks.dbcp2.model.UserDTO;

public interface IUserDAO {

	UserDTO	getUser(int userid);

	void getPoolProperties();

	int getNoOfUsers();
}
