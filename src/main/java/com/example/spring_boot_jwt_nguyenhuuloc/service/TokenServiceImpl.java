package com.example.spring_boot_jwt_nguyenhuuloc.service;

import com.example.spring_boot_jwt_nguyenhuuloc.entity.Token;
import com.example.spring_boot_jwt_nguyenhuuloc.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

