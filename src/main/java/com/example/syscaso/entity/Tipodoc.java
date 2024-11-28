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
@Table(name = "tipodoc")
public class Tipodoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "carta_presentacion")
    private String carta_presentacion;

    @Column(name = "carta_aceptacion")
    private Float carta_aceptacion;

    @Column(name = "modelo_convenio")
    private Date modelo_convenio;

    @OneToMany(mappedBy = "tipodoc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Documento> documentos; // Relación con Documento
}
