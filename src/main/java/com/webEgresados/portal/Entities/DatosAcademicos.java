package com.webEgresados.portal.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DatosAcademicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Postulante postulante;

    private String nivelMaximoEducacion;

    private Date anoDeEgreso;

    private String institucionEducativa;

    private String tituloObtenido;

    private String otraOfertaAgencia;

    private String formacionOtraOfertaAgencia;

    private String motivoParaElegirLaFormacion;
}
