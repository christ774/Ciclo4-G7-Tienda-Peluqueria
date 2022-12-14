package com.ciclo4.peluqueria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document("clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Client {
    @Id
    private String id;


    private String name_surname;
    private Long identification;
    private String email;
    private Long phoneNumber;
    private  String address;


    
}
