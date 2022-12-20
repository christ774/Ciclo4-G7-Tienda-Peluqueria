package com.ciclo4.peluqueria.controller;

import com.ciclo4.peluqueria.model.Admin;
import com.ciclo4.peluqueria.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/admin")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping()
    public List<Admin> getAll(){
        return adminService.getListAdminOrdered();
    }

    @GetMapping("/{id}")
    public Optional<Admin> findEmployeeByID(@PathVariable("id") String id){
        return adminService.getAdminById(id);
    }

    @PostMapping()
    public String saveAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return adminService.deleteById(id);

    }
}
