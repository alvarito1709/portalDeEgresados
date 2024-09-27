package com.webEgresados.portal.Entities;


import javax.persistence.*;

@Entity
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Postulante postulante;

    @Lob
    private byte[] curriculo;
}
