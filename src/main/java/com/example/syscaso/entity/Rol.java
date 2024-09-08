package com.example.syscaso.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name="roles")
public class Rol{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="estado")
	private char estado;
	
	
	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Acceso> accesos = new HashSet<>();
	
	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Usuario> usuarios = new HashSet<>();
}