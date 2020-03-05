package com.example.kafka.KafkaApi.component;

import com.example.kafka.KafkaApi.model.SimpleModel;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Sender sender;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate, Sender sender) {
        this.kafkaTemplate = kafkaTemplate;
        this.sender = sender;
    }

    @Bean
    public String producerRandomMessages() throws InterruptedException {
        SimpleModel[] stubs = {
                new SimpleModel("Albert Camus", "Nobody realizes that some people expend tremendous energy merely to be normal."),
                new SimpleModel("Al McGuire", "The only mystery in life is why the kamikaze pilots wore helmets."),
                new SimpleModel("Abraham Lincoln", "If I were two-faced, would I be wearing this one?"),
                new SimpleModel("Abraham Lincoln", "Better to remain silent and be thought a fool than to speak out and remove all doubt."),
                new SimpleModel("Albert Einstein", "The difference between stupidity and genius is that genius has its limits."),
                new SimpleModel("Alexander Woollcott", "All the things I really like to do are either immoral, illegal or fattening."),
                new SimpleModel("Ambrose Bierce", "War is God’s way of teaching Americans geography."),
                new SimpleModel("Andy Rooney", "The average dog is a nicer person than the average person."),
                new SimpleModel("Ann Landers", "If you want your children to listen, try talking softly to someone else."),
                new SimpleModel("Arthur C. Clarke", "I don’t believe in astrology; I’m a Sagittarius and we’re skeptical."),
                new SimpleModel("Ashleigh Brilliant", "My opinions may have changed, but not the fact that I’m right.")
        };

        while(true){
            int random = new Random().nextInt(10 + 1);
            SimpleModel simpleModel = stubs[random];
            sender.send(simpleModel, random);
            Thread.sleep(10000L);
        }
    }


}
