package com.VeterinariaK.appAtenciones.services;

import java.util.List;

import com.VeterinariaK.appAtenciones.models.Atencion;

public interface AtencionService {
    List<Atencion> listar();
    Atencion obtenerPorId(Integer id);
    Atencion guardar(Atencion atenciones);
    Atencion actualizar(Atencion atenciones);
    void eliminar(Integer id);
}