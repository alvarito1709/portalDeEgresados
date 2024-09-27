package com.webEgresados.portal.Entities;


import javax.persistence.*;

@Entity
public class postulante_habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Postulante postulante;

    @ManyToOne
    private Habilidad habilidad;

    private String nivel;
}
