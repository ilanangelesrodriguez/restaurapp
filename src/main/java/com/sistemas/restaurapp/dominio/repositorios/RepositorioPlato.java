package com.sistemas.restaurapp.dominio.repositorios;

import com.sistemas.restaurapp.dominio.entidades.Plato;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPlato extends CrudRepository<Plato, Long> {
}
