package com.example.even.api.controller;

import com.example.even.api.model.SimpleModel;
import org.springframework.web.bind.annotation.*;
import com.example.even.api.service.SimpleModelService;

import java.util.List;

@RestController
@RequestMapping("api/")
public class EvenController {

    private final SimpleModelService simpleModelService;

    public EvenController(SimpleModelService simpleModelService) {
        this.simpleModelService = simpleModelService;
    }

    @GetMapping
    public List<SimpleModel> findAll(){
        return simpleModelService.findAll();
    }

}
