package com.webEgresados.portal.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Modalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreModalidad;

    @ManyToMany(mappedBy = "modalidades")
    private List<PreferenciaLaboral> preferenciasLaborales;
}
