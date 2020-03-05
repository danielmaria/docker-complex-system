package com.example.even.api.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("SimpleModel")
public class SimpleModel {

    private String id;
    private String title;
    private String description;

    public SimpleModel() {
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
