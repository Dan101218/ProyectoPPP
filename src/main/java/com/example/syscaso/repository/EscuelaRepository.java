package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long> {

}
