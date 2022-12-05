package com.ciclo4.peluqueria.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document("agendas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Diary {


    private String id;
    private String id_employee;
    private String name_employee;
    private String name_client;
    private String service;
    private LocalDate date;
    private List<Appointment> citas;


}
