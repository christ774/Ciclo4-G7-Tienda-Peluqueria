package com.ciclo4.peluqueria.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Client {

    private String id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String gender;
    
}
