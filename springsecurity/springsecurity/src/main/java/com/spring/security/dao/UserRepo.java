package com.spring.security.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	Optional<User> findUserByEmail(String email);
}
