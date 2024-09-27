package com.webEgresados.portal.Entities;


import javax.persistence.*;

@Entity
public class idiomaPostulante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Postulante postulante;

    @ManyToOne
    private Idioma idioma;

    private String nivel;
}
