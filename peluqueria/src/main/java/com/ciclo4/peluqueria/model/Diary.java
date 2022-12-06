package com.ciclo4.peluqueria.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document("agendas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Diary {
    @Id
    private String id;

    @DBRef
    private List<Appointment> citas;


}
