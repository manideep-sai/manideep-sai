package com.aryan.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aryan.mts.beans.User;
import com.aryan.mts.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public User addNewUser(User user) throws Exception {
		
		return iUserRepository.save(user);
	}

	@Override
	public User updateUserDetails(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(User user) throws Exception {
		String email = user.getEmail();
		User currentUser = iUserRepository.findByEmail(email);
		if(currentUser!=null) {
			iUserRepository.deleteById((int) currentUser.getUserId());
		}
		return null;
	}

}
