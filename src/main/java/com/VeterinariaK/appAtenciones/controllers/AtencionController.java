package com.VeterinariaK.appAtenciones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.VeterinariaK.appAtenciones.models.Atencion;
import com.VeterinariaK.appAtenciones.services.AtencionService;
;

@Controller
@RequestMapping("/atenciones")
public class AtencionController {

     @Autowired
    private AtencionService atencionService;

    @GetMapping
    public String listarAtenciones(Model model) {
        model.addAttribute("atenciones", atencionService.listar());
        return "atenciones/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaAtencion(Model model) {
        model.addAttribute("atencion", new Atencion());
        return "atenciones/form-nuevo";
    }

    @PostMapping("/guardar")
    public String guardarAtencion(Atencion atencion) {
        atencionService.guardar(atencion);
        return "redirect:/atenciones";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarAtencion(@PathVariable("id") Integer id, Model model) {
        Atencion atencion = atencionService.obtenerPorId(id);
        if (atencion != null) {
            model.addAttribute("atencion", atencion);
            return "atenciones/form-editar";
        } else {
            return "redirect:/atenciones";
        }
    }

    @PostMapping("/actualizar")
    public String actualizarAtencion(Atencion atencion) {
        atencionService.actualizar(atencion);
        return "redirect:/atenciones";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarAtencion(@PathVariable("id") Integer id) {
        atencionService.eliminar(id);
        return "redirect:/atenciones";
    }

}
