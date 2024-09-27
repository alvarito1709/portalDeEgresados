package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class experienciaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tituloDelPuesto;

    private String descripcionDeTareas;

    private String tipoDeRelacionLaboral;

    private Date fechaDeInicio;

    private Date fechaDeFin;

    private String area;

    private String tieneEmprendimiento;

    //private String ppsAgencia;

    @ManyToOne
    private Postulante postulante;
}
