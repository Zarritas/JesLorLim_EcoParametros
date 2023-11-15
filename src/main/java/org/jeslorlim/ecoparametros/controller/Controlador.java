package org.jeslorlim.ecoparametros.controller;

import jakarta.validation.Valid;
import static org.jeslorlim.ecoparametros.model.Colecciones.*;
import org.jeslorlim.ecoparametros.model.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("saludos")
public class Controlador {

    @ModelAttribute("lista_generos")
    private Map<String, String> devuelveListaGeneros(){
     return leeGeneros();
    }
    @ModelAttribute("lista_paises")
    private Map<String, String> devuelveListaPaises(){
        return leePaises();
    }
    @ModelAttribute("lista_aficiones")
    private Map<String, String> devuelveListaAficiones(){
        return leeAficiones();
    }
    @ModelAttribute("lista_musicas")
    private Map<String, String> devuelveListaMusicas(){
        return leeMusica();
    }

    @GetMapping("form")
    public String formulario(@ModelAttribute("formulario") Formulario formulario){
        return "formulario";
    }

    @PostMapping("recibeParametrosObjeto")
    public String recibeParametros(Model modelo,
                                   @Valid @ModelAttribute("formulario") Formulario datosFormulario,
                                   BindingResult resultadoVinculadoParametros){

        String mensajeEnFormulario;
        if (resultadoVinculadoParametros.hasErrors()) {
            mensajeEnFormulario = "El formulario tiene errores.";
        }else {
            mensajeEnFormulario = "El formulario NO tiene errores";
        }
        modelo.addAttribute("mensaje",mensajeEnFormulario);
        return "formulario";
    }
}