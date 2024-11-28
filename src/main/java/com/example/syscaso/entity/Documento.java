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
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "tamaño")
    private Float tamaño;

    @Column(name = "fecha_subida")
    private Date fecha_subida;

    @Column(name = "hora_subida")
    private Date hora_subida;

    @Column(name = "estado")
    private Long estado;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ppp_id", nullable = false) // Clave foránea hacia PPP
    private PPP ppp; // Relación con PPP

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tipodoc_id", nullable = false) // Clave foránea hacia Tipodoc
    private Tipodoc tipodoc; // Relación con Tipodoc
}
