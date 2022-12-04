package com.ciclo4.peluqueria.service;



import com.ciclo4.peluqueria.model.Employee;

import com.ciclo4.peluqueria.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    //Tarea asignada a Christian
    @Autowired
    EmployeeRepository employeeRepository;


    public String saveEmployee(Employee employee) {
        employee.setName(employee.getName().toLowerCase());
        employee.setSurname(employee.getSurname().toLowerCase());
        boolean state=employee.getId() == null || !employeeRepository.existsById(employee.getId());
        employeeRepository.save(employee);

        if (state) {
            return "Empleado registrado correctamente";
        } else {
            return "La información empleado ha sido actualizada";
        }
    }

    public List<Employee> getListEmployeeOrdered() {
        List<Employee> EmployeeList = employeeRepository.findAll();
        EmployeeList.sort(Comparator.comparing(Employee::getName));
        return EmployeeList;
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public String deleteById(String id) {
        if (employeeRepository.existsById(id)) {
            Optional<Employee> client = employeeRepository.findById(id);
            employeeRepository.deleteById(id);
            return "Empleado  " + client.get().getName() + " a sido eliminado";
        } else {
            return " empleado No a sido eliminado";
        }
    }

}
