package com.ciclo4.peluqueria.repository;


import com.ciclo4.peluqueria.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
    //Tarea asignada a Christian
}
