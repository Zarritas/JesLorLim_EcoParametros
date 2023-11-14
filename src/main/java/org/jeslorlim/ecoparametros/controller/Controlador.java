package org.jeslorlim.ecoparametros.controller;
import jakarta.validation.Valid;
import org.jeslorlim.ecoparametros.model.Colecciones;
import org.jeslorlim.ecoparametros.model.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("saludos")
public class Controlador {
    @GetMapping("hola")
    public String holaMundo(){
        System.out.println("Hola mundo!!");
        return "form_devolucion";
    }


    @GetMapping("form")
    public String formulario(Model modelo){
//      Colecciones
        Map<String,String> paises = Colecciones.leePaises();
        Map<String,String> generos = Colecciones.leeGeneros();
        Map<String,String> aficiones = Colecciones.leeAficiones();
        Map<String,String> musicas = Colecciones.leeMusica();

//      Valores por defecto
        Formulario formulario = new Formulario();

//      Pasamos datos al formulario
        modelo.addAttribute("lista_paises",paises);
        modelo.addAttribute("lista_generos",generos);
        modelo.addAttribute("lista_aficiones",aficiones);
        modelo.addAttribute("lista_musicas",musicas);
        modelo.addAttribute("formulario",formulario);

        System.out.println("enviando el formulario al cliente");
        return "formulario";
    }

    @PostMapping("recibeParametrosObjeto")
    public String recibeParametros(Model modelo,
                                   @Valid Formulario datosFormulario,
                                   BindingResult resultadoVinculadoParametros){

        String mensajeEnFormulario;
        if (resultadoVinculadoParametros.hasErrors()) {
            mensajeEnFormulario = "El formulario tiene errores.";
        }else {
            mensajeEnFormulario = "El formulario NO tiene errores";
        }
        modelo.addAttribute("mensaje",mensajeEnFormulario);

        modelo.addAttribute("form", datosFormulario);
        modelo.addAttribute("lista_paises", Colecciones.leePaises());
        modelo.addAttribute("lista_generos", Colecciones.leeGeneros());
        modelo.addAttribute("lista_aficiones", Colecciones.leeAficiones());
        modelo.addAttribute("lista_musicas", Colecciones.leeMusica());
        return "formulario";
    }
}