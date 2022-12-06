package com.ciclo4.peluqueria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Client {
    @Id
    private String id;

    @Field("name")
    private String name;
    @Field("surname")
    private String surname;
    @Field("username")
    private String username;
    @Field("password")
    private String password;
    @Field("email")
    private String email;
    @Field("phoneNumber")
    private Long phoneNumber;
    @Field("gender")
    private String gender;

    
}
