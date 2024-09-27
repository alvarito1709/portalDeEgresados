package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Voluntariado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tituloVoluntariado;

    private String descripcionVoluntariado;

    private Date fechaDeInicio;

    private Date fechaDeFin;

    private String area;

    @ManyToOne
    private Postulante postulante;
}
