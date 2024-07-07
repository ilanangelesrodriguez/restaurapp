package com.sistemas.restaurapp.infrestructura.controladores;

import com.sistemas.restaurapp.dominio.entidades.Empleado;
import com.sistemas.restaurapp.dominio.servicios.empleado.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados")
public class ControladorEmpleado {

    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("empleados", servicioEmpleado.buscarTodos());
        return "empleados/listar";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "empleados/crear";
    }

    @PostMapping("/guardar")
    public String guardar(Empleado empleado) {
        servicioEmpleado.guardar(empleado);
        return "redirect:/empleados/listar";
    }

    @GetMapping("/editar")
    public String editar(Long id, Model model) {
        model.addAttribute("empleado", servicioEmpleado.buscarPorId(id));
        return "empleados/editar";
    }

    @PostMapping("/actualizar")
    public String actualizar(Empleado empleado) {
        servicioEmpleado.actualizar(empleado);
        return "redirect:/empleados/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Long id) {
        servicioEmpleado.eliminarPorId(id);
        return "redirect:/empleados/listar";
    }

}
