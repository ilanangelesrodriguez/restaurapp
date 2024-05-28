package com.sistemas.restaurapp.dominio.servicios.cliente;

import com.sistemas.restaurapp.dominio.entidades.Cliente;
import com.sistemas.restaurapp.dominio.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioClienteImpl implements ServicioCliente {
    @Autowired
    private RepositorioCliente repositorioCliente;

    @Override
    public Cliente guardar(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente buscarPorId(Long aLong) {
        return repositorioCliente.findById(aLong).orElse(null);
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void eliminarPorId(Long aLong) {
        repositorioCliente.deleteById(aLong);
    }
}
