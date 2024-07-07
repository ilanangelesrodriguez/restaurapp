package com.sistemas.restaurapp.infrestructura.controladores;

import com.sistemas.restaurapp.dominio.entidades.Cliente;
import com.sistemas.restaurapp.dominio.entidades.Mesa;
import com.sistemas.restaurapp.dominio.entidades.Reserva;
import com.sistemas.restaurapp.dominio.servicios.cliente.ServicioCliente;
import com.sistemas.restaurapp.dominio.servicios.mesa.ServicioMesa;
import com.sistemas.restaurapp.dominio.servicios.reserva.ServicioReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class ControladorReserva {

    @Autowired
    private ServicioReserva servicioReserva;
    @Autowired
    private ServicioCliente servicioCliente;
    @Autowired
    private ServicioMesa servicioMesa;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", servicioReserva.buscarTodos());
        return "reservas/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("mesas", servicioMesa.buscarTodos());
        return "reservas/crear";
    }

    @PostMapping("/guardar")
    public String guardar(Reserva reserva, Cliente cliente) {

        servicioCliente.guardar(cliente);
        reserva.setCliente(cliente);
        servicioReserva.guardar(reserva);

        return "redirect:/reservas";
    }

    @GetMapping("/editar")
    public String editar(Long id, Model model) {
        model.addAttribute("reserva", servicioReserva.buscarPorId(id));
        model.addAttribute("mesas", servicioMesa.buscarTodos());
        return "reservas/editar";
    }

    @PostMapping("/actualizar")
    public String actualizar(Reserva reserva) {
        servicioReserva.actualizar(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Long id) {
        servicioReserva.eliminarPorId(id);
        return "redirect:/reservas";
    }

}
