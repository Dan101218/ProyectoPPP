package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Lineacarrera;

@Repository
public interface LineacarreraRepository extends JpaRepository<Lineacarrera, Long> {

}
