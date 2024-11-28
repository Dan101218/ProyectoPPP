package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {

}
