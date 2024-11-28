package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.PPP;

@Repository
public interface PPPRepository extends JpaRepository<PPP, Long> {

}
