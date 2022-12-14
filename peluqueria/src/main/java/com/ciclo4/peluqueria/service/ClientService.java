package com.ciclo4.peluqueria.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo4.peluqueria.model.Client;
import com.ciclo4.peluqueria.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;
    
    public String saveClient(Client client) {
        client.setName_surname(client.getName_surname().toLowerCase());
        client.setName_surname(client.getName_surname().toLowerCase());
        boolean state=client.getId() == null || !clientRepository.existsById(client.getId());
        clientRepository.save(client);

        if (state) {
            return "Usuario registrado correctamente";
        } else {
            return "La información ha sido actualizada";
        }
    }

    public List<Client> getListClientOrdered() {
        List<Client> clientsList = clientRepository.findAll();
        clientsList.sort(Comparator.comparing(Client::getName_surname));
        return clientsList;
    }

    public Optional<Client> getClientById(String id) {
        return clientRepository.findById(id);
    }

    public String deleteById(String id) {
        if (clientRepository.existsById(id)) {
            Optional<Client> client = clientRepository.findById(id);
            clientRepository.deleteById(id);
            return "Cliente " + client.get().getName_surname() + " eliminado";
        } else {
            return "No eliminado";
        }
    }

    
}
