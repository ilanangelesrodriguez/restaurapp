package com.sistemas.restaurapp.dominio.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlato;

    @NotNull
    private String nombre;
    private String descripcion;
    @NotNull
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
