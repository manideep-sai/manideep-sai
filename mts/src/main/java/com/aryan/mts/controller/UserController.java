package com.aryan.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aryan.mts.beans.User;
import com.aryan.mts.service.IUserService;
import com.aryan.mts.response.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService iUserService;
	
	@PostMapping("/register")
	public ResponseEntity<ResponseInfo> addNewUser(@Valid @RequestBody User user, HttpServletRequest request) throws Exception {
		if(user!=null) {
			User newUser = iUserService.addNewUser(user);
			ResponseInfo responseInfo = new ResponseInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED.name(), newUser.toString(), request.getRequestURI());
			return new ResponseEntity<ResponseInfo>(responseInfo, HttpStatus.CREATED);
		}
		return null;
	}

	public User updateUserDetails(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@DeleteMapping("/delete")
	public User deleteUser(@RequestBody User user) throws Exception {
		if(user!=null) {
			return iUserService.deleteUser(user);
		}
		return null;
	}

}
