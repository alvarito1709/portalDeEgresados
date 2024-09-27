package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreHabilidad;

    @ManyToMany(mappedBy = "habilidades")
    private List<Postulante> postulantes;
}
