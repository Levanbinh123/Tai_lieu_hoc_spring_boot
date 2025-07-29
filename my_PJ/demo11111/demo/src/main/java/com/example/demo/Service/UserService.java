package com.example.demo.Service;


import com.example.demo.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public User findByUsername(String username);


    public void save(User user);
}
