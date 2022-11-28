package com.ciclo4.peluqueria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ciclo4.peluqueria.model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String>{
    
}
