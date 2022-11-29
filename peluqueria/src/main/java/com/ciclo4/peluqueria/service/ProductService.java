package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    //Tarea asignada a Juan Felipe

    @Autowired
    ProductRepository productRepository;
}
