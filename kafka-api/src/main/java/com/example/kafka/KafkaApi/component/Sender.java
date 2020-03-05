package com.example.kafka.KafkaApi.component;

import com.example.kafka.KafkaApi.model.SimpleModel;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class Sender {

    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    private String topicName = "myTopic";

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Gson jsonConverter;

    public Sender(KafkaTemplate<String, String> kafkaTemplate, Gson jsonConverter) {
        this.kafkaTemplate = kafkaTemplate;
        this.jsonConverter = jsonConverter;
    }

    public void send(SimpleModel simpleModel, int header){
        Message<String> message = MessageBuilder
                .withPayload(jsonConverter.toJson(simpleModel))
                .setHeader(KafkaHeaders.TOPIC, topicName)
                .setHeader(KafkaHeaders.MESSAGE_KEY, formatKeyValue(header))
                .setHeader(KafkaHeaders.PARTITION_ID, 0)
                .build();

        LOG.info("sending message='{}' to topic='{}'", simpleModel, topicName);
        kafkaTemplate.send(message);
    }

    private String formatKeyValue(int integer){
        String evenOrOddNumber = integer % 2 == 0 ? "EVEN" : "ODD";
        return MessageFormat.format("MESSAGE_TYPE_{0}", evenOrOddNumber);
    }
}
