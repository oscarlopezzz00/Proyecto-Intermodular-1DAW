package com.iesmontenaranco.grupox.casarural.model;

import java.time.LocalDate;
/**
 * Clase que representa una reserva de la casa rural.
 *
 * Cada objeto Reserva se corresponde con un registro almacenado
 * en la tabla "reservas" de la base de datos.
 */

public class Reserva {

    private Long id;
    private String nombre_cliente;
    private String telefono;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    /**
     * Constructor vacío.
     *
     * Se incluye para permitir la creación de objetos sin inicializar
     * todos sus atributos en el momento de la instanciación.
     */
    public Reserva() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param id identificador de la reserva
     * @param nombreCliente nombre de la persona que realiza la reserva
     * @param telefono teléfono de contacto asociado a la reserva
     * @param fechaInicio fecha de inicio de la reserva
     * @param fechaFin fecha de fin de la reserva
     */
    public Reserva(Long id, String nombreCliente, String telefono, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.nombre_cliente = nombreCliente;
        this.telefono = telefono;
        this.fecha_inicio = fechaInicio;
        this.fecha_fin = fechaFin;
    }

    /**
     * Devuelve el identificador de la reserva.
     *
     * @return identificador de la reserva
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador de la reserva.
     *
     * @param id nuevo identificador de la reserva
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombreCliente() {
        return nombre_cliente;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombreCliente nuevo nombre del cliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombre_cliente = nombreCliente;
    }

    /**
     * Devuelve el teléfono de contacto.
     *
     * @return teléfono asociado a la reserva
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de contacto.
     *
     * @param telefono nuevo teléfono asociado a la reserva
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la fecha de inicio de la reserva.
     *
     * @return fecha de inicio
     */
    public LocalDate getFechaInicio() {
        return fecha_inicio;
    }

    /**
     * Establece la fecha de inicio de la reserva.
     *
     * @param fechaInicio nueva fecha de inicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fecha_inicio = fechaInicio;
    }

    /**
     * Devuelve la fecha de fin de la reserva.
     *
     * @return fecha de fin
     */
    public LocalDate getFechaFin() {
        return fecha_fin;
    }

    /**
     * Establece la fecha de fin de la reserva.
     *
     * @param fechaFin nueva fecha de fin
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fecha_fin = fechaFin;
    }
}
