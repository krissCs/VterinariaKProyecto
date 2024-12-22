package com.VeterinariaK.appAtenciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VeterinariaK.appAtenciones.models.Mascota;
import com.VeterinariaK.appAtenciones.repositories.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> listar() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota obtenerPorId(Integer id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public Mascota guardar(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota actualizar(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public void eliminar(Integer id) {
        mascotaRepository.deleteById(id);
    }

}
