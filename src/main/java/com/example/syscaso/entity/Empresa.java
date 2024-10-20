package com.example.syscaso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Empresa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_seq")
	@SequenceGenerator(name = "empresa_seq", sequenceName = "empresa_sequence", allocationSize = 1)
	private Long idempresa;

	private String razonsocial;
	private String direccion;
	private String email;
	private Long telefono;
	private String sectorr;
	private Long aniovinculacion;
	private String estado;
}
