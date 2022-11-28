package com.ciclo4.peluqueria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ciclo4.peluqueria.model.Client;
import com.ciclo4.peluqueria.service.ClientService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping()
    public List<Client> getAllClients(){
        return clientService.getListClientOrdered();
    }

    @GetMapping("/{id}")
    public Optional<Client> findClientByID(@PathVariable("id") String id){
        return clientService.getClientById(id);
    }

    @PostMapping()
    public String saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return clientService.deleteById(id);

    }

}
