package com.sistemas.restaurapp.dominio.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_mesa")
    private Mesa mesa;

    @NotNull
    private LocalDateTime fechaHora;
    @NotNull
    private Integer numeroPersonas;

    public Date getFechaHoraAsDate() {
        return java.sql.Timestamp.valueOf(this.fechaHora);
    }

}
