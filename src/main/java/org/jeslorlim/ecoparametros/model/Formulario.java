package org.jeslorlim.ecoparametros.model;


import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formulario {
    @NotBlank
    private String nombre;
    @Size(min = 6,max = 12, message = "La contraseña tiene que se entre 6 caracteres y 12 caracteres.")
    @Clave
    private String clave;
//    @Clave
//    private String valiClave;
    private String descripcion;
    private String pais;
    private String genero;
    private List<String> aficiones;
    @NotEmpty
    private List<String> musicas;
    @Past(message = "La fecha de nacimiento tiene que ser una fecha pasada.")
    private LocalDate fecha;
    private Float puntuacion;
    @Min(value = 18, message="La edad tiene que ser mayor que 18 años.")
    @Max(value = 67, message="La edad tiene que ser menor que 67 años.")
    private Integer edad;
    private Double pi;
}
