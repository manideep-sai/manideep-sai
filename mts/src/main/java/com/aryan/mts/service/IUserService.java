package com.aryan.mts.service;

import com.aryan.mts.beans.User;

public interface IUserService {

	public User addNewUser(User user) throws Exception;
	public User updateUserDetails(User user) throws Exception;
	public User deleteUser(User user) throws Exception;
	
}
