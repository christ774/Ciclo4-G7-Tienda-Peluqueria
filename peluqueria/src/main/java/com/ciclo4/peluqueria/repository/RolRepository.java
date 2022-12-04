package com.ciclo4.peluqueria.repository;

import com.ciclo4.peluqueria.model.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RolRepository extends MongoRepository<Rol,String> {
}
