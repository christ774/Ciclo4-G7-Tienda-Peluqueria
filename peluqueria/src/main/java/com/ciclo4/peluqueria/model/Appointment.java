package com.ciclo4.peluqueria.model;



import java.time.LocalDate;



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

    private String id;
    @DBRef
    private Client client_id;
    private LocalDate fecha_hora;


    
}