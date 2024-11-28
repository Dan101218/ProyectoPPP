package com.example.syscaso.service;

import com.example.syscaso.dto.LoginDto;
import com.example.syscaso.dto.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    void register(RegisterDto registerDto);
}
