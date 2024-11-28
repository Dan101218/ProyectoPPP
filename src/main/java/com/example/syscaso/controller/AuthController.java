package com.example.syscaso.controller;

import com.example.syscaso.dto.AuthResponseDto;
import com.example.syscaso.dto.LoginDto;
import com.example.syscaso.dto.RegisterDto;
import com.example.syscaso.service.AuthService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto){

        // Recibir el token del servicio de autenticación
        String token = authService.login(loginDto);

        // Crear el DTO de respuesta con el token
        AuthResponseDto authResponseDto = new AuthResponseDto();
        authResponseDto.setAccessToken(token);

        // Retornar la respuesta con el token
        return new ResponseEntity<>(authResponseDto, HttpStatus.OK);
    }

    // Registro de nuevo usuario
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        try {
            // Llamada al servicio para registrar al usuario
            authService.register(registerDto);
            return ResponseEntity.ok("Usuario creado exitosamente");
        } catch (Exception e) {
            // En caso de error, se envía una respuesta de error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear el usuario: " + e.getMessage());
        }
    }
}
