package com.iesmontenaranco.grupox.casarural.controller.web;

import com.iesmontenaranco.grupox.casarural.model.Contacto;
import com.iesmontenaranco.grupox.casarural.repository.ContactoRepository;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

/**
 * Controlador para gestionar las páginas informativas de la web.
 */
@Controller
public class ContactoControler {
    private final ContactoRepository contactoRepository;

    public ContactoControler(ContactoRepository contactoRepository){
        this.contactoRepository=contactoRepository;
    }

    /**
     * Muestra la página de contacto.
     * URL: http://localhost:5000/contacto
     */
    @GetMapping("/contacto")
    public String contacto(Model model) {
        // Podemos pasar datos útiles a la vista, como el email de la casa
        model.addAttribute("emailContacto", "info@casaruralasturias.es");
        model.addAttribute("telefono", "985 00 00 00");
        if (!model.containsAttribute("mensajeEnviado")) {
            model.addAttribute("mensajeEnviado", false);
        }

        // Retorna la ruta física: src/main/resources/templates/public/es/contacto.html
        return "public/es/contacto";
    }
    @PostMapping("/contacto")
    public String enviar(Contacto contacto , RedirectAttributes ra){
        contacto.setFecha_envio(LocalDate.now());
        contactoRepository.save(contacto);
        ra.addFlashAttribute("mensajeEnviado",true);
        return "redirect:/contacto";

    }
}