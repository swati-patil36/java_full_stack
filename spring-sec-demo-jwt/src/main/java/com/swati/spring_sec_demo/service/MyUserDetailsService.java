package com.swati.spring_sec_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.swati.spring_sec_demo.dao.UserRepo;
import com.swati.spring_sec_demo.model.User;
import com.swati.spring_sec_demo.model.UserPrincipal;

// import jakarta.websocket.server.ServerEndpoint;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired 
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =repo.findByUsername(username);
        if(user==null){
            System.out.println("User not found  404");
            throw new UsernameNotFoundException("User not found 404");
        }
        return new UserPrincipal(user); // Replace with actual implementation
    }
    
}
