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


    private String name_surname;
    private Long identification;
    private String specialty;
    private String email;
    private long phoneNumber;
    private  String address;






}
