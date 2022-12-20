package com.ciclo4.peluqueria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ciclo4.peluqueria.model.Appointment;
import com.ciclo4.peluqueria.service.AppointmentService;

@RestController
@RequestMapping("/citas")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping()
    public List<Appointment> getAllAppointments(){
        return appointmentService.getListAppointmentOrdered();
    }

    @GetMapping("/{id}")
    public Optional<Appointment> findAppointmentByID(@PathVariable("id") String id){
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping()
    public String saveAppointment(@RequestBody Appointment appointment) {
        return appointmentService.saveAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return appointmentService.deleteAppointmentById(id);

    }

}
