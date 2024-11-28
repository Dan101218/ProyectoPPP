package com.example.syscaso.entity;

import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Data
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "horas")
    private Long horas;
    
    @Column(name = "año")
    private Long año;
    
    @Column(name = "lugar")
    private Long lugar;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "escuela_id", nullable = false) // Clave foránea hacia Escuela
    private Escuela escuela; // Relación con Escuela

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Notificacion> notificaciones; // Relación con Notificacion

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PPP> ppp; // Relación con PPP
}
