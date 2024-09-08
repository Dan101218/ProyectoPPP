package com.example.syscaso.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syscaso.entity.Acceso;
@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{

}