package com.sistemas.restaurapp.dominio.servicios.mesa;


import com.sistemas.restaurapp.dominio.entidades.Mesa;
import com.sistemas.restaurapp.dominio.repositorios.RepositorioMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMesaImpl implements ServicioMesa {
    @Autowired
    private RepositorioMesa repositorioMesa;

    @Override
    public Mesa guardar(Mesa mesa) {
        return repositorioMesa.save(mesa);
    }

    @Override
    public Mesa buscarPorId(Long aLong) {
        return repositorioMesa.findById(aLong).orElse(null);
    }

    @Override
    public Iterable<Mesa> buscarTodos() {
        return repositorioMesa.findAll();
    }

    @Override
    public Mesa actualizar(Mesa mesa) {
        return repositorioMesa.save(mesa);
    }

    @Override
    public void eliminarPorId(Long aLong) {
        repositorioMesa.deleteById(aLong);
    }
}
