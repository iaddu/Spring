package com.spring.security.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.dao.UserRepo;


@Service
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	public UserRepo userRepo;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    		Optional<com.spring.security.model.User> user=userRepo.findUserByEmail(username);
        if(user.isPresent()) {
        	var userObj=user.get();
        	return User.builder()
    				.username(userObj.getEmail())
    				.password(userObj.getPassword())
    				.roles(userObj.getRole())
    				.build();
        }
        else throw new UsernameNotFoundException("no such user exited ");
        
    }
    
}
