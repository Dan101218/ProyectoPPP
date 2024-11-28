package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
