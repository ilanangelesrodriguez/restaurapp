package com.sistemas.restaurapp.infrestructura.controladores;

import com.sistemas.restaurapp.dominio.entidades.Mesa;
import com.sistemas.restaurapp.dominio.servicios.mesa.ServicioMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mesas")
public class ControladorMesa {

    @Autowired
    private ServicioMesa servicioMesa;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("mesas", servicioMesa.buscarTodos());
        return "mesas/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("mesa", new Mesa());
        return "mesas/crear";
    }

    @PostMapping("/guardar")
    public String guardar(Mesa mesa) {
        servicioMesa.guardar(mesa);
        return "redirect:/mesas";
    }
}
