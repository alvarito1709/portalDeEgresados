package com.webEgresados.portal.Entities;


import javax.persistence.*;

@Entity
public class OtroEstudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Postulante postulante;

    private String otroEstudio;

    
}
