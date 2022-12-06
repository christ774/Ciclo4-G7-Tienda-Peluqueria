package com.ciclo4.peluqueria.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("empleados")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

//Tarea asignada a Christian
public class Employee {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("surname")
    private String surname;
    @Field("identification")
    private Long identification;
    @Field("specialty")
    private String specialty;
    @Field("username")
    private String username;
    @Field("password")
    private String password;
    @Field("email")
    private String email;
    @Field("phoneNumber")
    private long phoneNumber;
    @Field("gender")
    private String gender;





}
