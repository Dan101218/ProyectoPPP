package com.example.syscaso.repository;

import com.example.syscaso.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {
    // Método para buscar un rol por su nombre
    Optional<Rol> findByName(String name);
}
