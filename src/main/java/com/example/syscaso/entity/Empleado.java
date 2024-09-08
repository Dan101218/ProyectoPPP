package com.example.syscaso.entity;




import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="empleados")
public class Empleado{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="documento" , length = 8)
	private String documento;
	@Column(name="telefono", length = 9)
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="estado")
	private char estado;
	
	@OneToOne(mappedBy = "empleados")
	 @JsonBackReference
	private Usuario usuarios;
}
