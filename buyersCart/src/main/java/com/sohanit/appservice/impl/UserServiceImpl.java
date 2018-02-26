package com.sohanit.appservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sohanit.app.model.UserDetails;
import com.sohanit.app.repo.UserRepository;
import com.sohanit.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
   

    @Override
    public void save(UserDetails user) {
        user.setPassWord(bCryptPasswordEncoder.encode(user.getPassWord()));
        userRepository.save(user);
    }

    @Override
    public UserDetails findByUsername(String username) {
        return userRepository.findByUserName(username);
    }
}