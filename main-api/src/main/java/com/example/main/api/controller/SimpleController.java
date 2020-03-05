package com.example.main.api.controller;

import com.example.feing.ExampleFeign.SimpleModel;
import com.example.main.api.integration.EvenIntegration;
import com.example.main.api.integration.OddIntegration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SimpleController {

    private final OddIntegration oddIntegration;
    private final EvenIntegration evenIntegration;

    public SimpleController(OddIntegration oddIntegration, EvenIntegration evenIntegration) {
        this.oddIntegration = oddIntegration;
        this.evenIntegration = evenIntegration;
    }

    @GetMapping("/odd")
    public List<SimpleModel> findAllOdd(){
        List<SimpleModel> all = oddIntegration.findAll();
        return oddIntegration.findAll();
    }

    @GetMapping("/even")
    public List<SimpleModel> findAllEven(){
        List<SimpleModel> all = evenIntegration.findAll();
        return evenIntegration.findAll();
    }
}
