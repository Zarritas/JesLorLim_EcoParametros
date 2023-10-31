package org.jeslorlim.ecoparametros.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colecciones {
    private static final Map<String, String> paises = new HashMap<>();
    private static final Map<String, String> generos = new HashMap<>();

    private static final Map<String, String> aficiones = new HashMap<>();


    static {
        paises.put("ES", "España");
        paises.put("FR", "Francia");
        paises.put("PT", "Portugal");
        paises.put("IT", "Italia");

        generos.put("F","Femenino");
        generos.put("M","Masculino");
        generos.put("O","Otro");

        aficiones.put("L","Leer");
        aficiones.put("C","Comer");
        aficiones.put("V","Videojuegos");
        aficiones.put("D","Dormir");
    }

    public static Map<String, String> leePaises() {
        return paises;
    }
    public static Map<String, String> leeGeneros() {
        return generos;
    }
    public static Map<String, String> leeAficiones() {
        return aficiones;
    }

}