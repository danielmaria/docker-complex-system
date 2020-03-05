package com.example.even.api.repository;

import com.example.even.api.model.SimpleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleModelRepository extends CrudRepository<SimpleModel, String> {
}
