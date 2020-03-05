package com.example.odd.api.repository;

import com.example.odd.api.model.SimpleModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleModelRepository extends MongoRepository<SimpleModel, String> {
}
