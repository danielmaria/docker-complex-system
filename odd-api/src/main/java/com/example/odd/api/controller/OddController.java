package com.example.odd.api.controller;

import com.example.odd.api.model.SimpleModel;
import com.example.odd.api.service.SimpleModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class OddController {

    private final SimpleModelService simpleModelService;

    public OddController(SimpleModelService simpleModelService) {
        this.simpleModelService = simpleModelService;
    }

    @GetMapping
    public List<SimpleModel> findAll(){
        return simpleModelService.findAll();
    }

}
