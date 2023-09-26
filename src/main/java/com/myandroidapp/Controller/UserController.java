package com.myandroidapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myandroidapp.Service.UserService;
import com.myandroidapp.model.User;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping("user/add")
	@ResponseBody
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
		
	}
    @GetMapping("/login")
    public String login(@RequestBody User user) {
    	if(user.getName().equals("santosh")&& user.getPassword().equals("1234"))
    	{
    		return user.getEmail();
    		
    	}
    	else
    	{
    		return "failed";
    	}
    	
    	

}
    }

