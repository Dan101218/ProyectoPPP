package com.example.syscaso.config;

import com.example.syscaso.entity.Rol;
import com.example.syscaso.entity.Usuario;
import com.example.syscaso.repository.RolRepository;
import com.example.syscaso.repository.UsuarioRepository;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public void run(String... args) throws Exception {
        // Verificar si los roles existen en la base de datos, si no, crear los roles
        if (rolRepository.count() == 0) {
            Rol adminRole = new Rol();
            adminRole.setName("ROLE_ADMIN");
            rolRepository.save(adminRole);

            Rol userRole = new Rol();
            userRole.setName("ROLE_USER");
            rolRepository.save(userRole);
        }

        // Crear un usuario admin si no existe
        if (usuarioRepository.count() == 0) {
            // Crear el usuario admin
            Usuario admin = new Usuario();
            admin.setName("juan");
            admin.setUsername("admin");
            admin.setEmail("admin@example.com");
            admin.setPassword("$2a$10$7l.HlXTl1p1RPXNf3To.IepBy1AhrBw9q5FdPzz0TqbtHV2ZyCCk6"); // Contraseña codificada (ej: "admin123")

            // Recuperar el rol de admin
            Rol adminRole = rolRepository.findByName("ROLE_ADMIN").orElseThrow(() -> new RuntimeException("Role ADMIN not found"));

            // Asignar el rol al usuario
            admin.setRoles(Set.of(adminRole));

            // Guardar el usuario en la base de datos
            usuarioRepository.save(admin);
        }
    }
}
