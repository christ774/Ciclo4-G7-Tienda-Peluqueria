package com.ciclo4.peluqueria.service;

import com.ciclo4.peluqueria.model.Admin;

import com.ciclo4.peluqueria.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public String saveAdmin(Admin admin) {
        admin.setName(admin.getName().toLowerCase());
        admin.setSurname(admin.getSurname().toLowerCase());
        boolean state=admin.getId() == null || !adminRepository.existsById(admin.getId());
        adminRepository.save(admin);

        if (state) {
            return "Usuario administrador a sido registrado correctamente";
        } else {
            return "La información del usuario Administrador ha sido actualizada";
        }
    }

    public List<Admin> getListAdminOrdered() {
        List<Admin> adminListList = adminRepository.findAll();
        adminListList.sort(Comparator.comparing(Admin::getName));
        return adminListList;
    }

    public Optional<Admin> getAdminById(String id) {
        return adminRepository.findById(id);
    }

    public String deleteById(String id) {
        if (adminRepository.existsById(id)) {
            Optional<Admin> admin = adminRepository.findById(id);
            adminRepository.deleteById(id);
            return "El usuario administrador  " + admin.get().getName() + " a sido eliminado";
        } else {
            return " el usuario Administrador No a sido eliminado";
        }
    }
}