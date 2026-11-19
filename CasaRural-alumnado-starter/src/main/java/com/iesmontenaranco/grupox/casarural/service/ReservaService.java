package com.iesmontenaranco.grupox.casarural.service;

import com.iesmontenaranco.grupox.casarural.model.Reserva;
import com.iesmontenaranco.grupox.casarural.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio encargado de la lógica de negocio relacionada con las reservas.
 *
 * Esta clase actúa como intermediaria entre los controladores y el repositorio,
 * permitiendo centralizar la gestión de las reservas del sistema.
 */
@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> obtenerTodas() {
        return reservaRepository.findAll();
    }

    public Reserva obtenerPorId(Long id) {
        return reservaRepository.findById(id);
    }

    /**
     * Guarda o actualiza una reserva validando disponibilidad.
     */
    public void guardar(Reserva reserva) {
        // 1. Validación lógica: La fecha fin no puede ser anterior a la de inicio
        if (reserva.getFechaFin().isBefore(reserva.getFechaInicio())) {
            throw new RuntimeException("La fecha de fin no puede ser anterior a la de inicio.");
        }

        // 2. Validación de disponibilidad:
        // Buscamos si existe alguna reserva que se solape con las fechas solicitadas
        boolean solapa = reservaRepository.findAll().stream().anyMatch(r ->

                (reserva.getFechaInicio().isBefore(r.getFechaFin()) &&
                        reserva.getFechaFin().isAfter(r.getFechaInicio()))

                        && !r.getId().equals(reserva.getId())
        );

        if (solapa) {
            throw new RuntimeException("Las fechas seleccionadas ya están ocupadas por otra reserva.");
        }

        reservaRepository.save(reserva);
    }

    // Ahora puedes hacer que actualizar llame a guardar para reutilizar la lógica
    public void actualizar(Reserva reserva) {
        this.guardar(reserva);
    }

    public void eliminar(Long id) {
        reservaRepository.deleteById(id);
    }
}