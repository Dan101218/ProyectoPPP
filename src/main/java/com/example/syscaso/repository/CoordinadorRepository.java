package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Coordinador;

@Repository
public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {

}