package com.ciclo4.peluqueria.service;


import com.ciclo4.peluqueria.model.Diary;

import com.ciclo4.peluqueria.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
@Service
public class DiaryService {

    @Autowired
    DiaryRepository diaryRepository;

    public String saveDiary(Diary diary) {
        diary.setName_client(diary.getName_client().toLowerCase());
        diary.setName_employee(diary.getName_employee().toLowerCase());
        boolean state=diary.getId() == null || !diaryRepository.existsById(diary.getId());
        diaryRepository.save(diary);

        if (state) {
            return "la agenda creado correctamente";
        } else {
            return "La información de la agenda ha sido actualizada";
        }
    }

    public List<Diary> getListDiaryOrdered() {
        List<Diary> diaryList = diaryRepository.findAll();
        diaryList.sort(Comparator.comparing(Diary::getName_client));
        return diaryList;
    }

    public Optional<Diary> getDiaryById(String id) {
        return diaryRepository.findById(id);
    }

    public String deleteById(String id) {
        if (diaryRepository.existsById(id)) {
            Optional<Diary> diary = diaryRepository.findById(id);
            diaryRepository.deleteById(id);
            return "Agenda del cliente  " + diary.get().getName_client() + "  Asi eliminado";
        } else {
            return " la agenda del Cliente No a sido eliminado ";
        }
    }
}
