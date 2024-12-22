package com.VeterinariaK.appAtenciones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.VeterinariaK.appAtenciones.models.Mascota;
import com.VeterinariaK.appAtenciones.services.MascotaService;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/mascotas")
public class MascotaController {

     @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public String listarMascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.listar());
        return "mascotas/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaMascota(Model model) {
        model.addAttribute("mascota", new Mascota());
        return "mascotas/form-nuevo";
    }

    @PostMapping("/guardar")
    public String guardarMascota(@Valid Mascota mascota, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            
            return "mascotas/form-nuevo";
        }
        mascotaService.guardar(mascota);
        return "redirect:/mascotas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarMascota(@PathVariable("id") Integer id, Model model) {
        Mascota mascota = mascotaService.obtenerPorId(id);
        if (mascota != null) {
            model.addAttribute("mascota", mascota);
            return "mascotas/form-editar";
        } else {
            return "redirect:/mascotas";
        }
    }

    @PostMapping("/actualizar")
    public String actualizarMascota(@Valid Mascota mascota, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "mascotas/form-editar";
        }
        mascotaService.actualizar(mascota);
        return "redirect:/mascotas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMascota(@PathVariable("id") Integer id) {
        mascotaService.eliminar(id);
        return "redirect:/mascotas";
    }

}
