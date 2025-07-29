package com.example.demo.Controller;

import com.example.demo.Dao.UserRepository;
import com.example.demo.Entity.Role;
import com.example.demo.Entity.User;
import com.example.demo.Entity.dtos.RegiterUser;
import com.example.demo.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    UserRepository userRepository;
    UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
@PostMapping("/process")
    public void process(@RequestBody User user) {
        String userName = user.getUsername();
User userEx =userRepository.findByUsername(userName);
if(userEx != null) {
throw new RuntimeException("Username already exists");
}
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
User u = new User();
u.setUsername(userName);
u.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
Role role = new Role();
userRepository.save(u);
        userService.save(user);
}
}
