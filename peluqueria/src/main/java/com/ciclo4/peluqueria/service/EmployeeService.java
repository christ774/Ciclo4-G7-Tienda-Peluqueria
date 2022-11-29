package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    //Tarea asignada a Christian
    @Autowired
    EmployeeRepository employeeRepository;
}
