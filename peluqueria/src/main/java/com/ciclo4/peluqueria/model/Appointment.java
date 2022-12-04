package com.ciclo4.peluqueria.model;



import java.time.LocalDate;

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

    private String idappointment; //id cita
    private String nameappointment; //nombre cita
    private String clientappointment;
    private String idschedule; //idagenda
    private String timeappointment; //hora
    
    private LocalDate dateappointment; //fechacita

    
}