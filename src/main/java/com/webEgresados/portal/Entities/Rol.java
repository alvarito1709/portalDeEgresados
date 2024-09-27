package com.webEgresados.portal.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;
}
