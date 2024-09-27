package com.webEgresados.portal.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Postulante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private Long DNI;

    @NotNull
    private Long CUIL;

    @NotNull
    private String email;

    @NotNull
    private String celular;

    @NotNull
    private Date fechaDeNacimiento;

    @NotNull
    private String genero;

    @NotNull
    private String provincia;

    @NotNull
    private String certificadoDiscapacidad;

    @ManyToMany
    @JoinTable( name = "idiomaPostulante",
    joinColumns = @JoinColumn(name = "postulante_id"),
    inverseJoinColumns = @JoinColumn(name = "idioma_id"))
    private List<Idioma> idiomas;


    private String situacionLaboralActual;

    @ManyToMany
    @JoinTable( name = "postulante_habilidad",
            joinColumns = @JoinColumn(name = "postulante_id"),
            inverseJoinColumns = @JoinColumn(name = "habilidad_id")
    )
    private List<Habilidad> habilidades;

}
