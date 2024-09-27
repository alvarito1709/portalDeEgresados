package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombreIdioma;

    @ManyToMany(mappedBy = "idiomas")
    private List<Postulante> postulantes;
}
