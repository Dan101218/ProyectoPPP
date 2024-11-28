package com.example.syscaso.entity;

import java.sql.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "evaluacion")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nota")
    private Double nota;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ppp_id", nullable = false) // Clave foránea hacia PPP
    private PPP ppp; // Relación con PPP
}
