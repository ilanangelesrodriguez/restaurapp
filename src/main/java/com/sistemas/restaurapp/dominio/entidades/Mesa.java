package com.sistemas.restaurapp.dominio.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesa;

    @NotNull
    private Integer numeroMesa;
    @NotNull
    private Integer capacidad;
    @NotNull
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
