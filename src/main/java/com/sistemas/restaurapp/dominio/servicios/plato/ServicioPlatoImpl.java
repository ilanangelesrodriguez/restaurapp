package com.sistemas.restaurapp.dominio.servicios.plato;

import com.sistemas.restaurapp.dominio.entidades.Plato;
import com.sistemas.restaurapp.dominio.repositorios.RepositorioPlato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPlatoImpl implements ServicioPlato {
    @Autowired
    private RepositorioPlato repositorioPlato;

    @Override
    public Plato guardar(Plato plato) {
        return repositorioPlato.save(plato);
    }

    @Override
    public Plato buscarPorId(Long aLong) {
        return repositorioPlato.findById(aLong).orElse(null);
    }

    @Override
    public Iterable<Plato> buscarTodos() {
        return repositorioPlato.findAll();
    }

    @Override
    public Plato actualizar(Plato plato) {
        return repositorioPlato.save(plato);
    }

    @Override
    public void eliminarPorId(Long aLong) {
        repositorioPlato.deleteById(aLong);
    }
}
