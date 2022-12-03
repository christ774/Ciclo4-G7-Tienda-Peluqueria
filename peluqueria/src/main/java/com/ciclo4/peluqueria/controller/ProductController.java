package com.ciclo4.peluqueria.controller;

import com.ciclo4.peluqueria.model.Product;
import com.ciclo4.peluqueria.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Product> findProductByID(@PathVariable("id") String id){
        return productService.getProductById(id);
    }

    @PostMapping()
    public String saveProduct (@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById (@PathVariable ("id") String id){
        return productService.deleteProductById(id);

    }
}