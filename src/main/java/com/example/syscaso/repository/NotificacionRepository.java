package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.syscaso.entity.Notificacion;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

}
