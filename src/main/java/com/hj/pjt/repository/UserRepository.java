package com.hj.pjt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hj.pjt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//Optional<User> findByUseremail(String email);

}
