package com.ciclo4.peluqueria.repository;

import com.ciclo4.peluqueria.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    //Tarea asignada a Juan Felipe

}
