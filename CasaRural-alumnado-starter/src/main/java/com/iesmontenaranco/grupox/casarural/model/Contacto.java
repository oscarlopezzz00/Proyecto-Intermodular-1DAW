package com.iesmontenaranco.grupox.casarural.model;


import java.time.LocalDate;

public class Contacto {
    private long id;
    private String nombre;
    private String email;
    private String telefono;
    private String mensaje;
    private LocalDate fecha_envio;

    public Contacto(long id, String nombre, String email, String telefono, String mensaje, LocalDate fecha_envio) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.mensaje = mensaje;
        this.fecha_envio = fecha_envio;
    }

    public Contacto (){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }
}
