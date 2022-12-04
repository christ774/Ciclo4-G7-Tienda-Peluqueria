package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.repository.AppoinmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppoinmentService { //Tarea asignada a Alvaro

    @Autowired
    AppoinmentRepository appoinmentRepository;
}
