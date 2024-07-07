package com.sistemas.restaurapp.infrestructura.controladores;

import com.sistemas.restaurapp.dominio.entidades.Cliente;
import com.sistemas.restaurapp.dominio.servicios.cliente.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ControladorCliente {

    @Autowired
    private ServicioCliente servicioCliente;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("clientes", servicioCliente.buscarTodos());
        return "clientes/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/crear";
    }

    @PostMapping("/guardar")
    public String guardar(Cliente cliente) {
        servicioCliente.guardar(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editar")
    public String editar(Long id, Model model) {
        model.addAttribute("cliente", servicioCliente.buscarPorId(id));
        return "clientes/editar";
    }

    @PostMapping("/actualizar")
    public String actualizar(Cliente cliente) {
        servicioCliente.actualizar(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Long id) {
        servicioCliente.eliminarPorId(id);
        return "redirect:/clientes";
    }

}
