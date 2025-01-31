package com.example.DemoFeign.client;

import com.example.DemoFeign.config.ExemploClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "exemplo-client", url = "http://localhost:8081",
            configuration = ExemploClientConfiguration.class)
public interface ExemploClient {

    @RequestMapping(method = RequestMethod.GET, value = "/exemplo")
    String obterExemplo();
}
