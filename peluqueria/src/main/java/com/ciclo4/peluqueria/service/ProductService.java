package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.model.Product;

import com.ciclo4.peluqueria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    //Tarea asignada a Juan Felipe

    @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public String saveProduct(Product product){
        boolean state = product.getId() == null || !productRepository.existsById(product.getId());
        productRepository.save(product);

        if (state) {
            return "Producto creado correctamente";
        } else {
            return "Producto actualizado";
        }
    }
    
    public Optional<Product> getProductById(String id){
        return productRepository.findById(id);
    }

    public String deleteProductById(String id){
        if (productRepository.existsById(id)){
            Optional<Product> product = productRepository.findById(id);
            productRepository.deleteById(id);
            return "Producto con ID: "+product.get().getId()+ " eliminado";}
            else {
                return "No eliminado";
            }
        }
}

}

