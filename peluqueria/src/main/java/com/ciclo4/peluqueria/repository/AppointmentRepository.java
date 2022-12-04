package com.ciclo4.peluqueria.repository;

import com.ciclo4.peluqueria.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String>{
    //Tarea asignada a Alvaro
}
