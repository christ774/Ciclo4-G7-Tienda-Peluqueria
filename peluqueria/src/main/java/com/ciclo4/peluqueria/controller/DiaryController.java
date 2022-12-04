package com.ciclo4.peluqueria.controller;


import com.ciclo4.peluqueria.model.Diary;
import com.ciclo4.peluqueria.service.DiaryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendas")
@CrossOrigin(origins = "*")
public class DiaryController {

    @Autowired
    DiaryService diaryService;

    @GetMapping()
    public List<Diary> getAll(){
        return diaryService.getListDiaryOrdered();
    }

    @GetMapping("/{id}")
    public Optional<Diary> findDiaryByID(@PathVariable("id") String id){
        return diaryService.getDiaryById(id);
    }

    @PostMapping()
    public String saveDiary(@RequestBody Diary diary) {
        return diaryService.saveDiary(diary);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return diaryService.deleteById(id);

    }
}
