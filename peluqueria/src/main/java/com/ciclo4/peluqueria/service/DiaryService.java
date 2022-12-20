package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.model.Diary;

import com.ciclo4.peluqueria.model.Employee;
import com.ciclo4.peluqueria.repository.DiaryRepository;
import com.ciclo4.peluqueria.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
@Service
public class DiaryService {

    @Autowired
    DiaryRepository diaryRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Diary>getAllDiarys(){
        return diaryRepository.findAll();
    }

    public Diary saveDiary(Diary diary) {
        return diaryRepository.save(diary);

    }


    public Optional<Diary> getDiaryById(String id) {
        Optional <Diary> diary= diaryRepository.findById(id);
        Optional <Employee> employee = employeeRepository.findById(diary.get().getId_employee());
        diary.get().setName_employee(employee.get().getName_surname());
        diary.get().setSpecialty(employee.get().getSpecialty());
        return diary;
    }

    public String deleteById(String id) {
        if (diaryRepository.existsById(id)) {
            diaryRepository.deleteById(id);
            return "Agenda eliminada";
        } else {
            return " la agenda  No a sido eliminado ";
        }
    }

}
