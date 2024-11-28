package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Sede;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Long> {

}
