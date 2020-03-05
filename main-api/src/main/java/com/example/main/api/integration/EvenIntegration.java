package com.example.main.api.integration;


import com.example.feing.ExampleFeign.SimpleModel;
import com.example.main.api.config.ClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "evenService", url = "http://localhost:8082/api", configuration = ClientConfig.class)
public interface EvenIntegration {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<SimpleModel> findAll();
}
