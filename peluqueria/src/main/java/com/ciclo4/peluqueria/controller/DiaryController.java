package com.ciclo4.peluqueria.controller;


import com.ciclo4.peluqueria.model.Diary;
import com.ciclo4.peluqueria.service.DiaryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendas")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class DiaryController {

    @Autowired
    DiaryService diaryService;

    @GetMapping()
    public List<Diary> findAllDiary(){
        return diaryService.getAllDiarys();
    }

    @GetMapping("/{id}")
    public Optional<Diary> findDiaryByID(@PathVariable("id") String id){
        return diaryService.getDiaryById(id);
    }

    @PostMapping()
    public Diary saveDiary(@RequestBody Diary diary) {
        return diaryService.saveDiary(diary);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable ("id") String id){
        return diaryService.deleteById(id);

    }
}
