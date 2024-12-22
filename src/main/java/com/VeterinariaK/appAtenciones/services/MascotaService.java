package com.VeterinariaK.appAtenciones.services;

import java.util.List;

import com.VeterinariaK.appAtenciones.models.Mascota;

public interface MascotaService {
    List<Mascota> listar();
    Mascota obtenerPorId(Integer id);
    Mascota guardar(Mascota mascota);
    Mascota actualizar(Mascota mascota);
    void eliminar(Integer id);
}
