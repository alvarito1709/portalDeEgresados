package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class PreferenciaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Postulante postulante;

    private String enBusquedaDeEmpleo;


    @ManyToMany
    @JoinTable(name = "preferencia_disponibilidad",
    joinColumns = @JoinColumn(name = "preferencia_id"),
    inverseJoinColumns = @JoinColumn(name = "disponibilidad_id"))
    private List<DisponibilidadHoraria> disponibilidadHoraria;

    @ManyToMany
    @JoinTable(name = "preferencia_modalidad",
    joinColumns = @JoinColumn(name = "preferencia_id"),
    inverseJoinColumns = @JoinColumn(name = "modalidad_id"))
    private List<Modalidad> modalidades;

    @ManyToMany
    @JoinTable(name = "preferencia_sectorProductivo",
    joinColumns = @JoinColumn(name = "preferencia_id"),
    inverseJoinColumns = @JoinColumn(name = "sectorProductivo_id"))
    private List<SectorProductivo> sectoresProductivos;

}
