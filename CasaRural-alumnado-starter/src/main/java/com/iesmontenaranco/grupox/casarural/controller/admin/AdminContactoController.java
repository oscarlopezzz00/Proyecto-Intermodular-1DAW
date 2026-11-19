package com.iesmontenaranco.grupox.casarural.controller.admin;

import com.iesmontenaranco.grupox.casarural.model.Contacto;
import com.iesmontenaranco.grupox.casarural.service.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador encargado de mostrar los mensajes de contacto
 * en el panel de administración.
 */
@Controller
@RequestMapping("/admin/contactos")
public class AdminContactoController {
private final ContactoService contactoService;


public AdminContactoController(ContactoService contactoService){
    this.contactoService=contactoService;
}

@GetMapping
public String listar(Model model){
    model.addAttribute("contactos",contactoService.obtenerTodas());
    return "admin/contactos/lista";
}


    /**
     * Constructor con inyección de dependencias.
     *
     *
     */

    /**
     * Muestra el listado de mensajes de contacto recibidos desde la web pública.
     *
     * @param model objeto que permite enviar datos a la vista
     * @return vista del listado de contactos
     */
}