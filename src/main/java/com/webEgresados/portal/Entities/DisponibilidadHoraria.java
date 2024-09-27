package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class DisponibilidadHoraria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDisponibilidad;

    @ManyToMany(mappedBy = "disponibilidadHoraria")
    private List<PreferenciaLaboral> preferenciasLaborales;
}
