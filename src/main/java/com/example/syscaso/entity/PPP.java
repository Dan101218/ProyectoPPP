package com.example.syscaso.entity;

import java.sql.Date;
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
@Table(name = "ppp")
public class PPP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @Column(name = "fecha_final")
    private Date fecha_final;

    @Column(name = "nota_final")
    private Double nota_final;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "empresa_id", nullable = false) // Clave foránea hacia Empresa
    private Empresa empresa; // Relación con Empresa

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "estudiante_id", nullable = false) // Clave foránea hacia Estudiante
    private Estudiante estudiante; // Relación con Estudiante

    @OneToMany(mappedBy = "ppp", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Evaluacion> evaluaciones; // Relación con Evaluacion

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supervisor_id", nullable = false) // Clave foránea hacia Supervisor
    private Supervisor supervisor; // Relación con Supervisor

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coordinador_id", nullable = false) // Clave foránea hacia Coordinador
    private Coordinador coordinador; // Relación con Coordinador

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "lineacarrera_id", nullable = false) // Clave foránea hacia LineaCarrera
    private Lineacarrera lineacarrera; // Relación con LineaCarrera

    @OneToMany(mappedBy = "ppp", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Documento> documentos; // Relación con Documento
}

