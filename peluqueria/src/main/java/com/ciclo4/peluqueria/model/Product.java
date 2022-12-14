package com.ciclo4.peluqueria.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("servicios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product { //Tarea asignada a Juan Felipe
    @Id
    private String id;


    private String service;
    private Integer cost;
    private Integer durationService;



}
