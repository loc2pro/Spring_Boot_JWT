package com.example.spring_boot_jwt_nguyenhuuloc.service;


import com.example.spring_boot_jwt_nguyenhuuloc.authen.UserPrincipal;
import com.example.spring_boot_jwt_nguyenhuuloc.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
