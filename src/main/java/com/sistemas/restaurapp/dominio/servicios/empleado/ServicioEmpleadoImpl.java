package com.sistemas.restaurapp.dominio.servicios.empleado;


import com.sistemas.restaurapp.dominio.entidades.Empleado;
import com.sistemas.restaurapp.dominio.repositorios.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleadoImpl implements ServicioEmpleado {
    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    @Override
    public Empleado guardar(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public Empleado buscarPorId(Long aLong) {
        return repositorioEmpleado.findById(aLong).orElse(null);
    }

    @Override
    public Iterable<Empleado> buscarTodos() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado actualizar(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public void eliminarPorId(Long aLong) {
        repositorioEmpleado.deleteById(aLong);
    }
}
