package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class SectorProductivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreSector;


    @ManyToMany(mappedBy = "sectoresProductivos")
    private List<PreferenciaLaboral> preferenciasLaborales;
}
