package com.myandroidapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myandroidapp.Repository.UserRepository;
import com.myandroidapp.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
		
		return userRepository.save(user);
	}
	
	public User findUserById(Long id) {
		return userRepository.findByUserId(id);
	}
}
