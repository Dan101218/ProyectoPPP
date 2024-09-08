package com.example.syscaso.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="clientes")
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha_nac")
	@Temporal(TemporalType.DATE)
	private Date fecha_nac;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "clientes")
	@JsonIgnore
	private Set<Renta> rentas;
}
