package org.jeslorlim.ecoparametros.controller;
import org.jeslorlim.ecoparametros.model.Colecciones;
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

        Map<String, String> paises = Colecciones.leePaises();
        Map<String, String> generos = Colecciones.leeGeneros();
        Map<String, String> aficiones = Colecciones.leeAficiones();

//        System.out.println(paises.toString());
//        System.out.println(generos.toString());
//        System.out.println(aficiones.toString());

        modelo.addAttribute("lista_paises",paises);
        modelo.addAttribute("lista_generos",generos);
        modelo.addAttribute("lista_aficiones",aficiones);


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
            @RequestParam(value = "genero",required = false) String genero,
            @RequestParam(value = "prueba_checkbox",required = false) ArrayList<String> checkbox,
            @RequestParam("Select") String seleccion,
            @RequestParam(value = "Select_multiple",required = false) ArrayList<String> select_multiple,
            @RequestParam("arch") String archivo,
            @RequestParam(value = "multi_arch",required = false) ArrayList<String> multi_archivo
    ){


        modelo.addAttribute("nombre",nombre);
        modelo.addAttribute("clave",clave);
        modelo.addAttribute("pi",pi);
        modelo.addAttribute("texto_area",descripcion);
        modelo.addAttribute("genero",genero);
        modelo.addAttribute("checkbox",checkbox);
        modelo.addAttribute("Select",seleccion);
        modelo.addAttribute("select_nultiple",select_multiple);
        modelo.addAttribute("archivo",archivo);
        modelo.addAttribute("multi_archivo",multi_archivo);

        System.out.println("He recibido el parameto nombre: "+nombre);
        System.out.println("He recibido el parameto clave: "+clave);
        System.out.println("Valor de Pi: "+pi);
        System.out.println("He recibido una descripción: "+descripcion);
        System.out.println("He recibido el parameto genero: "+genero);
        System.out.println("Checkbox");
        if (checkbox != null) {
            for (String s : checkbox){
                System.out.println(s);
            }
        }
        System.out.println("He recibido el parameto selección: "+seleccion);
        System.out.println("MultiSelección");
        if (select_multiple != null) {
            for (String s : select_multiple) {
                System.out.println(s);
            }
        }
        System.out.println("He recibido el parameto archivo: "+archivo);
        System.out.println("Multiarchivos");
        if (multi_archivo != null) {
            for (String s : multi_archivo) {
                System.out.println(s);
            }
        }

        System.out.println("coordenadoas de la imagen:");
        System.out.println("coordenadoas de la imagen:");


        return "form_devolucion";
    }
}