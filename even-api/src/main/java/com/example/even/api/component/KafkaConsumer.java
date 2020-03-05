package com.example.even.api.component;

import com.example.even.api.model.SimpleModel;
import com.example.even.api.repository.SimpleModelRepository;
import com.google.gson.Gson;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private final Gson jsonConverter;
    private final SimpleModelRepository simpleModelRepository;

    public KafkaConsumer(Gson jsonConverter, SimpleModelRepository simpleModelRepository) {
        this.jsonConverter = jsonConverter;
        this.simpleModelRepository = simpleModelRepository;
    }

    @KafkaListener(topics = "myTopic")
    public void getFromKafka(String model){
        SimpleModel simpleModel = (SimpleModel) jsonConverter.fromJson(model, SimpleModel.class);
        System.out.println(simpleModel.getTitle() + " - Consumed now.");
        simpleModelRepository.save(simpleModel);
    }
}
