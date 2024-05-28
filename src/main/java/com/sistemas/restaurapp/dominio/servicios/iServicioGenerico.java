package com.sistemas.restaurapp.dominio.servicios;

public interface iServicioGenerico<T, id> {
    T guardar(T t);
    T buscarPorId(id id);
    Iterable<T> buscarTodos();
    T actualizar(T t);
    void eliminarPorId(id id);
}
