package com.myandroidapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myandroidapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserId(Long userId);
	
	}