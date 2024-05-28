package com.sistemas.restaurapp.dominio.repositorios;

import com.sistemas.restaurapp.dominio.entidades.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioReserva extends CrudRepository<Reserva, Long> {
}
