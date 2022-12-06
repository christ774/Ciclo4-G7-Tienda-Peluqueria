package com.ciclo4.peluqueria.model;



import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//Tarea asignada a Alvaro
@Document("citas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Appointment {
    @Id
    private String id; //id cita

    @DBRef
    private Product name_service; //nombre cita
    @DBRef
    private Client client_id;
    @DBRef
    private Employee employee;

    private Date date_appointment; //fechacita


    
}