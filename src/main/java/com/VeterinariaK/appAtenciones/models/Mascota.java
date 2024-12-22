package com.VeterinariaK.appAtenciones.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_mascota")
    private Integer codMascota;

    @Column(name = "nombre_mascota")
    @NotBlank(message = "El nombre de la mascota no puede estar vacío")
    private String nombreMascota;

    @Column(name = "nombre_dueño")
    @NotBlank(message = "El nombre del dueño no puede estar vacío")
    private String nombreDueno;

    @Column(name = "peso_mascota")
    @NotNull(message = "El peso de la mascota no puede ser nulo")
    private Double pesoMascota;

    @Column(name = "tipo_mascota")
    @NotBlank(message = "El tipo de mascota no puede estar vacío")

    private String tipoMascota;

    public Integer getCodMascota() {
        return codMascota;
    }

    public void setCodMascota(Integer codMascota) {
        this.codMascota = codMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public Double getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(Double pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
}
