package com.swati.spring_sec_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.spring_sec_demo.model.User;

/**
 * UserRepo
 */
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}
