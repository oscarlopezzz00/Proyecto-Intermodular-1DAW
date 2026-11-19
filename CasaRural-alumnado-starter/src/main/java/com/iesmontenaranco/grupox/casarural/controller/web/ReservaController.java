package com.iesmontenaranco.grupox.casarural.controller.web;

import com.iesmontenaranco.grupox.casarural.model.Reserva;
import com.iesmontenaranco.grupox.casarural.service.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    /**
     * Muestra la página de reservas.
     * Mismo nombre que en el admin si quieres, o 'reservasEs' como tenías.
     */
    @GetMapping("/reservas")
    public String reservasEs(Model model) {
        // Obtenemos todas para la tabla
        model.addAttribute("reservas", reservaService.obtenerTodas());

        // Preparamos el objeto para el fragmento del formulario
        // Si no existe, el fragmento da error al buscar 'reserva.id'
        if (!model.containsAttribute("reserva")) {
            model.addAttribute("reserva", new Reserva());
        }

        return "public/es/reservas";
    }

    /**
     * Mismo nombre que en el AdminReservaController: "guardar"
     */
    @PostMapping("/reservas/guardar")
    public String guardar(Reserva reserva, RedirectAttributes ra) {
        try {
            reservaService.guardar(reserva);

            // Si todo va bien, guardamos el mensaje de éxito
            ra.addFlashAttribute("mensaje", "¡Reserva realizada con éxito!");
        } catch (RuntimeException e) {
            ra.addFlashAttribute("error", e.getMessage());

            ra.addFlashAttribute("reserva", reserva);
        }

        return "redirect:/reservas";
    }
}