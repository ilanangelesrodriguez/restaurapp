package com.sistemas.restaurapp.dominio.repositorios;

import com.sistemas.restaurapp.dominio.entidades.Mesa;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioMesa extends CrudRepository<Mesa, Long> {
}
