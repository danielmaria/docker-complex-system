package com.example.even.api.service;

import com.example.even.api.model.SimpleModel;
import com.example.even.api.repository.SimpleModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
        return StreamSupport.stream(simpleModelRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
