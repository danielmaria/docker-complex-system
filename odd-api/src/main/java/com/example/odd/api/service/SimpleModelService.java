package com.example.odd.api.service;

import org.springframework.stereotype.Service;
import com.example.odd.api.repository.SimpleModelRepository;
import com.example.odd.api.model.SimpleModel;

import java.util.List;

@Service
public class SimpleModelService {
    private final SimpleModelRepository simpleModelRepository;

    public SimpleModelService(SimpleModelRepository simpleModelRepository) {
        this.simpleModelRepository = simpleModelRepository;
    }

    public void saveSimpleModel(SimpleModel simpleModel){
        this.simpleModelRepository.save(simpleModel);
    }

    public List<SimpleModel> findAll() {
        return simpleModelRepository.findAll();
    }
}
