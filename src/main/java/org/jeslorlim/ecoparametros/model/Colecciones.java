package org.jeslorlim.ecoparametros.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colecciones {
    private static Map<String, String> paises;
//    private List<String> paisesA= new ArrayList<>();
    static {
        paises = new HashMap<>();
        paises.put("ES", "España");
        paises.put("FR", "Francia");
        paises.put("PT", "Portugal");
        paises.put("IT", "Italia");
    }

    public Map<String, String>(){

    }

}