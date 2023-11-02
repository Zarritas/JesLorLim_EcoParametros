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
    public String devuelveFormulario(Model modelo){

        modelo.addAttribute("lista_paises",Colecciones.leePaises());
        modelo.addAttribute("lista_generos",Colecciones.leeGeneros());
        modelo.addAttribute("lista_aficiones",Colecciones.leeAficiones());
        modelo.addAttribute("lista_musicas",Colecciones.leeMusica());

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
            @RequestParam("Select") String seleccion,
            @RequestParam(value = "Select_multiple",required = false) ArrayList<String> select_multiple
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
        modelo.addAttribute("aficionSeleccionado",aficionesSeleccionadas);
        modelo.addAttribute("Select",seleccion);
        modelo.addAttribute("select_nultiple",select_multiple);

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