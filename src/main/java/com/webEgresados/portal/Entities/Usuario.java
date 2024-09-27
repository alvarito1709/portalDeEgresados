package com.webEgresados.portal.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Postulante postulante;

    private String username;

    private String password;

    @ManyToMany
    @JoinTable(name = "usuario_rol",
    joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private List<Rol> roles;


}
