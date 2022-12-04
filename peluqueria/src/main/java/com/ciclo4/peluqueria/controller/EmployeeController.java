package com.ciclo4.peluqueria.controller;


import com.ciclo4.peluqueria.model.Employee;
import com.ciclo4.peluqueria.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAll(){
        return employeeService.getListEmployeeOrdered();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeByID(@PathVariable("id") String id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping()
    public String saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return employeeService.deleteById(id);

    }
}
