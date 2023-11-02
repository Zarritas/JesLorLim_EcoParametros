package org.jeslorlim.ecoparametros.model;

import lombok.*;

import java.util.ArrayList;

@Setter @AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
public class Formulario {
    private String nombre,clave,pi,descripcion,genero,seleccion;
    private ArrayList<String> aficiones, musica;

    public String getNombre() {
        return nombre;
    }
}
