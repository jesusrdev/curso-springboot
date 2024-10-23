package dev.otar.curso_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity // Mapear la clase a una tabla en la base de datos
// lombok
@Getter
@Setter
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor con todos los atributos
@Builder  // Para construir objetos
public class Carro {

    @Id
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private double precio;

}
