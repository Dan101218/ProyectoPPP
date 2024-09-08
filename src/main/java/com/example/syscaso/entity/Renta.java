package com.example.syscaso.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="rentas")
public class Renta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	@Column(name="fecha_reg")
	@Temporal(TemporalType.TIMESTAMP)
    private Date fecha_reg;
	@Column(name="fecha_dev")
	@Temporal(TemporalType.TIMESTAMP)
    private Date fecha_dev;
	@Column(name="fecha_ent")
	@Temporal(TemporalType.TIMESTAMP)
    private Date fecha_ent;
	
	@ManyToOne
	@JoinColumn(name= "cliente_id", nullable = false)
	private Cliente clientes;
	@ManyToOne	
	@JoinColumn(name="pelicula_id", nullable = false)

	private Pelicula peliculas;
	@ManyToOne
	@JoinColumn(name= "usuario_id", nullable = false)
	private Usuario usuarios;
		
}
