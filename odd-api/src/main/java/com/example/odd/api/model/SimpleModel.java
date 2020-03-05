package com.example.odd.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SimpleModel {

    private String title;
    private String description;

    public SimpleModel(String title, String description) {
        this.title = title;
        this.description = description;
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
