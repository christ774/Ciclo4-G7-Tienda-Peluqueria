package com.ciclo4.peluqueria.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("empleados")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

//Tarea asignada a Christian
public class Employee {
    private String id;
    private String name;
    private String surname;
    private Long identification;
    private String specialty;
    private String username;
    private String password;
    private String email;
    private long phoneNumber;
    private String gender;





}
