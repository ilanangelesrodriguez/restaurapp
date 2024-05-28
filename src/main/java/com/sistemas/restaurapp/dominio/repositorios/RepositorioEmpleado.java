package com.sistemas.restaurapp.dominio.repositorios;

import com.sistemas.restaurapp.dominio.entidades.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioEmpleado extends CrudRepository<Empleado, Long> {
}
