package com.sohanit.app.service;

import com.sohanit.app.model.UserDetails;

public interface UserService {
    void save(UserDetails user);

    UserDetails findByUsername(String username);
}