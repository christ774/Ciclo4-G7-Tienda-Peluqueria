package com.ciclo4.peluqueria.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo4.peluqueria.model.Appointment;
import com.ciclo4.peluqueria.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    
    public String saveAppointment(Appointment appointment) {

        boolean state=appointment.getClient_id() == null || !appointmentRepository.existsById(appointment.getClient_id());
        appointmentRepository.save(appointment);

        if (state) {
            return "cita registrada correctamente";
        } else {
            return "La información ha sido actualizada";
        }
    }

    public List<Appointment> getListAppointmentOrdered() {
        List<Appointment> appointmentsList = appointmentRepository.findAll();
        appointmentsList.sort(Comparator.comparing(Appointment::getClient_id));
        return appointmentsList;
    }

    public Optional<Appointment> getAppointmentById(String idappointment) {
        return appointmentRepository.findById(idappointment);
    }

    public String deleteAppointmentById(String idappointment) {
        if (appointmentRepository.existsById(idappointment)) {
            Optional<Appointment> appointment = appointmentRepository.findById(idappointment);
            appointmentRepository.deleteById(idappointment);
            return "cita" + appointment.get().getClient_id() + " eliminado";
        } else {
            return "No eliminado";
        }
    }

    
}
