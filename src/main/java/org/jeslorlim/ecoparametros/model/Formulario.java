package org.jeslorlim.ecoparametros.model;

import java.util.List;

public class Formulario {
    private String nombre,clave,pi,descripcion, pais, genero;
    private List<String> aficiones, musicas;

    public Formulario() {
    }

    public Formulario(String nombre, String clave, String pi, String descripcion, String genero, String pais, List<String> aficiones, List<String> musicas) {
        this.nombre = nombre;
        this.clave = clave;
        this.pi = pi;
        this.descripcion = descripcion;
        this.genero = genero;
        this.pais = pais;
        this.aficiones = aficiones;
        this.musicas = musicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }
}
