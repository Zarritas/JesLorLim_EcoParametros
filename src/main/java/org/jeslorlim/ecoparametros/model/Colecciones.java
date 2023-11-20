package org.jeslorlim.ecoparametros.model;

import java.util.HashMap;
import java.util.Map;
public class Colecciones {
    private static final Map<String, String> paises = new HashMap<>();
    private static final Map<String, String> generos = new HashMap<>();
    private static final Map<String, String> aficiones = new HashMap<>();
    private static final Map<String, String> musica = new HashMap<>();
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

        musica.put("H","Hip-Hop");
        musica.put("P","Pop");
        musica.put("J","Jazz");
        musica.put("R","Reaggeton");
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
    public static Map<String, String> leeMusica() {
        return musica;
    }
}