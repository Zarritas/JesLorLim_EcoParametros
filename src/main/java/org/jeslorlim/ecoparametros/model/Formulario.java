package org.jeslorlim.ecoparametros.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formulario {
    private String nombre,clave,descripcion, pais, genero;
    private List<String> aficiones, musicas;
    private LocalDate fecha;
    private Float puntuacion;
    private Integer edad;
    private Double pi;
}
