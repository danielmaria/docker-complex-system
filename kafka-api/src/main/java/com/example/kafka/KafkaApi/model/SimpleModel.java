package com.example.kafka.KafkaApi.model;

public class SimpleModel {

    private String title;
    private String description;

    public SimpleModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "SimpleModel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
