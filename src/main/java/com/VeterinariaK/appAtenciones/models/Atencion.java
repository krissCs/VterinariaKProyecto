package com.VeterinariaK.appAtenciones.models;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_atenciones")
public class Atencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_atencion")
    private Integer codigoAtencion;

    @Column(name = "nombre_cliente")
    @NotBlank(message = "El nombre del cliente no puede estar vacío")
    private String nombreCliente;

    @Column(name = "tipo_atencion")
    @NotBlank(message = "El tipo de atención no puede estar vacío")
    private String tipoAtencion;

    @Column(name = "fecha_atencion")
    @NotNull(message = "La fecha de atención no puede ser nula")
    private LocalDate fechaAtencion;

    @Column(name = "hora")
    @NotNull(message = "La hora de atención no puede ser nula")
    private LocalTime hora;

    @Column(name = "estado")
    @NotBlank(message = "El estado no puede estar vacío")
    private String estado;

    public Integer getCodigoAtencion() {
        return codigoAtencion;
    }

    public void setCodigoAtencion(Integer codigoAtencion) {
        this.codigoAtencion = codigoAtencion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}