package com.ciclo4.peluqueria.repository;

import com.ciclo4.peluqueria.model.Appoinment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppoinmentRepository extends MongoRepository<Appoinment, String>{
    //Tarea asignada a Alvaro
}
