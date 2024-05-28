package com.sistemas.restaurapp.dominio.servicios.reserva;

import com.sistemas.restaurapp.dominio.entidades.Reserva;
import com.sistemas.restaurapp.dominio.repositorios.RepositorioReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioReservaImpl implements ServicioReserva {
    @Autowired
    private RepositorioReserva repositorioReserva;

    @Override
    public Reserva guardar(Reserva reserva) {
        return repositorioReserva.save(reserva);
    }

    @Override
    public Reserva buscarPorId(Long aLong) {
        return repositorioReserva.findById(aLong).orElse(null);
    }

    @Override
    public Iterable<Reserva> buscarTodos() {
        return repositorioReserva.findAll();
    }

    @Override
    public Reserva actualizar(Reserva reserva) {
        return repositorioReserva.save(reserva);
    }

    @Override
    public void eliminarPorId(Long aLong) {
        repositorioReserva.deleteById(aLong);
    }
}
