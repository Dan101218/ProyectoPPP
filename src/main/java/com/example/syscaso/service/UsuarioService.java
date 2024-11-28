package com.example.syscaso.service;

import com.example.syscaso.dto.RegisterDto;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.entity.Usuario;
import com.example.syscaso.repository.RolRepository;
import com.example.syscaso.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * Método para crear un nuevo usuario.
     * @param registerDto Objeto con la información del usuario (nombre, correo, etc).
     * @return El usuario recién creado.
     */
    public Usuario createUser(RegisterDto registerDto) {
        // Verificamos si el nombre de usuario ya está registrado
        if (usuarioRepository.existsByUsername(registerDto.getUsername())) {
            throw new RuntimeException("Username is already taken");
        }

        // Verificamos si el correo ya está registrado
        if (usuarioRepository.existsByEmail(registerDto.getEmail())) {
            throw new RuntimeException("Email is already taken");
        }

        // Creamos un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.setName(registerDto.getName());
        usuario.setUsername(registerDto.getUsername());
        usuario.setEmail(registerDto.getEmail());
        usuario.setPassword(passwordEncoder.encode(registerDto.getPassword()));  // Cifra la contraseña

        // Buscamos y asignamos el rol 'ROLE_USER'
        Rol rol = rolRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Role USER not found"));

        Set<Rol> roles = new HashSet<>();
        roles.add(rol);
        usuario.setRoles(roles);  // Asignamos los roles al usuario

        // Guardamos el usuario en la base de datos
        return usuarioRepository.save(usuario);
    }

    /**
     * Método para obtener un usuario por su nombre de usuario.
     * @param username El nombre de usuario.
     * @return El usuario encontrado.
     */
    public Usuario getUserByUsername(String username) {
        return usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    /**
     * Método para obtener un usuario por su ID.
     * @param id El ID del usuario.
     * @return El usuario encontrado.
     */
    public Usuario getUserById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
