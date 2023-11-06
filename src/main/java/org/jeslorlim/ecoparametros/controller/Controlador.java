package org.jeslorlim.ecoparametros.controller;
import org.jeslorlim.ecoparametros.model.Colecciones;
import org.jeslorlim.ecoparametros.model.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        formulario.setNombre("Jesús");
        formulario.setMusicas(Arrays.asList("H","P"));
        formulario.setPais("E");
        formulario.setDescripcion("Hola a todos");
        formulario.setGenero("O");

//      Pasamos datos al formulario
        modelo.addAttribute("lista_paises",paises);
        modelo.addAttribute("lista_generos",generos);
        modelo.addAttribute("lista_aficiones",aficiones);
        modelo.addAttribute("lista_musicas",musicas);
        modelo.addAttribute("formulario",formulario);

        System.out.println("enviando el formulario al cliente");
        return "formulario";
    }


    @PostMapping("recibeParametros")
    public String recibeParametros(
            Model modelo,
            @RequestParam("nombre") String nombre,
            @RequestParam("clave") String clave,
            @RequestParam("pi") String pi,
            @RequestParam("descripcion") String descripcion,
            @RequestParam(value = "generoSeleccionado",required = false) String generoSeleccionado,
            @RequestParam(value = "aficionesSeleccionadas",required = false) ArrayList<String> aficionesSeleccionadas,
            @RequestParam(value = "paisSeleccionado",required = false) String paisSeleccionado,
            @RequestParam(value = "musicasSeleccionada",required = false) ArrayList<String> musicasSeleccionada
    ){
        modelo.addAttribute("lista_paises",Colecciones.leePaises());
        modelo.addAttribute("lista_generos",Colecciones.leeGeneros());
        modelo.addAttribute("lista_aficiones",Colecciones.leeAficiones());
        modelo.addAttribute("lista_musicas",Colecciones.leeMusica());

        modelo.addAttribute("nombre",nombre);
        modelo.addAttribute("clave",clave);
        modelo.addAttribute("pi",pi);
        modelo.addAttribute("descripcion",descripcion);
        modelo.addAttribute("generoSeleccionado",generoSeleccionado);
        modelo.addAttribute("aficionesSeleccionadas",aficionesSeleccionadas);
        modelo.addAttribute("paisSeleccionado",paisSeleccionado);
        modelo.addAttribute("musicasSeleccionadas", musicasSeleccionada);

        return "form_devolucion";
    }

    @PostMapping("recibeParametrosObjeto")
    public String recibeParametros(
            Model modelo, Formulario datosFormulario){
        modelo.addAttribute("form",datosFormulario);
        modelo.addAttribute("lista_paises",Colecciones.leePaises());
        modelo.addAttribute("lista_generos",Colecciones.leeGeneros());
        modelo.addAttribute("lista_aficiones",Colecciones.leeAficiones());
        modelo.addAttribute("lista_musicas",Colecciones.leeMusica());
        return "form_devolucion_obj";
    }
}