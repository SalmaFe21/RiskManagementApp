package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserServiceImpl implements UserServiceOldOne {
	
	@Autowired
	private UserRepository userRepository;

	

	@Override
	public void seConnecter(String matricule, String password) {
		
		User u = new User();
		u = findUserByMatricule("123");
		
	}



	@Override
	public User findUserByMatricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
