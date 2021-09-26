package com.example.spring_boot_jwt_nguyenhuuloc.service;


import com.example.spring_boot_jwt_nguyenhuuloc.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}