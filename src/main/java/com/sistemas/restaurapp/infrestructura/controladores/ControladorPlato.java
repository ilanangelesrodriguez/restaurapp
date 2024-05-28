package com.sistemas.restaurapp.infrestructura.controladores;

import com.sistemas.restaurapp.dominio.entidades.Plato;
import com.sistemas.restaurapp.dominio.servicios.plato.ServicioPlato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/platos")
public class ControladorPlato {

    @Autowired
    private ServicioPlato servicioPlato;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("platos", servicioPlato.buscarTodos());
        return "platos/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("plato", new Plato());
        return "platos/crear";
    }

    @PostMapping("/guardar")
    public String guardar(Plato plato) {
        servicioPlato.guardar(plato);
        return "redirect:/platos";
    }
}