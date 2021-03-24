package com.fb.faithfulblendzbe.controller;

import com.fb.faithfulblendzbe.model.Religion;
import com.fb.faithfulblendzbe.repository.ReligionRepository;
import com.fb.faithfulblendzbe.service.ReligionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/religion")
public class ReligionController {

    private ReligionService religionService;

    public ReligionController(ReligionService religionService) {
        this.religionService = religionService;
    }

    //Route GET All Movies
    @GetMapping("/")
    public Iterable<Religion> allReligions() {
        return religionService.getAllReligions();
    }
}
