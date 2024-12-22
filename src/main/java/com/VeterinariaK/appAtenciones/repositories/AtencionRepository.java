package com.VeterinariaK.appAtenciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VeterinariaK.appAtenciones.models.Atencion;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion, Integer> {

}