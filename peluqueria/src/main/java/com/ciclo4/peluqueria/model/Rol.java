package com.ciclo4.peluqueria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("rol")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rol {
    private String id;
    private String username;
    private String password;

}
