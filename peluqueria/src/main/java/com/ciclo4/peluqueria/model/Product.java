package com.ciclo4.peluqueria.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("servicios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product { //Tarea asignada a Juan Felipe
    @Id
    private String id;
    private String tipoServicio;
    private Integer precio;
    private Integer duracionServicio;
    private String idCliente;
}
