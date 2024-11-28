package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Tipodoc;

@Repository
public interface TipodocRepository extends JpaRepository<Tipodoc, Long> {

}
