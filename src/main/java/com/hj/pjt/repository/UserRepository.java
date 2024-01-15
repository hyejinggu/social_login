package com.hj.pjt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hj.pjt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
