package com.VeterinariaK.appAtenciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VeterinariaK.appAtenciones.models.Atencion;
import com.VeterinariaK.appAtenciones.repositories.AtencionRepository;

@Service
public class AtencionServiceImpl implements AtencionService {
    @Autowired
    private AtencionRepository atencionRepository;

    @Override
    public List<Atencion> listar() {
        return atencionRepository.findAll();
    }

    @Override
    public Atencion obtenerPorId(Integer id) {
        return atencionRepository.findById(id).orElse(null);
    }

    @Override
    public Atencion guardar(Atencion atenciones) {
        return atencionRepository.save(atenciones);
    }

    @Override
    public Atencion actualizar(Atencion atenciones) {
        return atencionRepository.save(atenciones);
    }

    @Override
    public void eliminar(Integer id) {
        atencionRepository.deleteById(id);
    }

}
