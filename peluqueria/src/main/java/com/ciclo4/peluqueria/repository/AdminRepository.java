package com.ciclo4.peluqueria.repository;

import com.ciclo4.peluqueria.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,String> {
}
