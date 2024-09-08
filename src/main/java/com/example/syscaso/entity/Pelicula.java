package com.example.syscaso.entity;



import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="director")
    private String director;
    @Column(name="estado")
    private char estado;
    
    @ManyToOne
    @JoinColumn(name="genero_id", nullable = false)
    private Genero generos;
    
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "peliculas")
    @JsonIgnore
	private Set<Renta> rentas;
   
}
