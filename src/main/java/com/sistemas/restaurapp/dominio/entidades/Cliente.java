package com.sistemas.restaurapp.dominio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private String email;
    @NotNull
    private String telefono;
    @NotNull
    private String direccion;
}
