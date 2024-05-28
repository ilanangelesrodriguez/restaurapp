package com.sistemas.restaurapp.dominio.repositorios;

import com.sistemas.restaurapp.dominio.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioCliente extends CrudRepository<Cliente, Long> {
}
