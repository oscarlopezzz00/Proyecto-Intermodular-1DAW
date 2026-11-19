package com.iesmontenaranco.grupox.casarural.controller.web;

import com.iesmontenaranco.grupox.casarural.service.ImagenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador encargado de gestionar las peticiones de la web pública.
 *
 * La aplicación dispone de una versión en castellano y otra en inglés,
 * por lo que las vistas se organizan en carpetas separadas según el idioma.
 */
@Controller
public class PublicController {

    private final ImagenService imagenService;

    public PublicController(ImagenService imagenService) {
        this.imagenService = imagenService;
    }

    /**
     * Muestra la página principal en castellano.
     *
     * @return nombre lógico de la vista de inicio en castellano
     */
    @GetMapping("/")
    public String home(Model model) {


        return "public/es/index";
    }

    /**
     * Muestra la página principal en inglés.
     *
     * @return nombre lógico de la vista de inicio en inglés
     */
    @GetMapping("/en")
    public String homeEn() {
        return "public/es/index";
    }

    /**
     * Muestra la página de la casa rural en castellano.
     *
     * @return nombre lógico de la vista de la casa en castellano
     */
    @GetMapping("/casa")
    public String casaEs(Model model) {

        model.addAttribute("imagenes", imagenService.obtenerTodas());

        return "public/es/casa";
    }

    /**
     * Muestra la página de aviso legal en castellano.
     *
     * @return nombre lógico de la vista de aviso legal en castellano
     */
    @GetMapping("/aviso-legal")
    public String avisoLegalEs() {
        return "public/es/aviso-legal";
    }
}