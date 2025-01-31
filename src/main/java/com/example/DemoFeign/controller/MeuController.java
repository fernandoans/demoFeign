package com.example.DemoFeign.controller;

import com.example.DemoFeign.client.ExemploClient;
import com.example.DemoFeign.client.IBGEClient;
import com.example.DemoFeign.model.Estado;
import com.example.DemoFeign.model.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exemplofeign")
public class MeuController {

    @Autowired
    private IBGEClient ibgeClient;

    @Autowired
    private ExemploClient exemploClient;

    @GetMapping("/estados")
    public List<Estado> obterEstado() {
        return ibgeClient.obterEstado();
    }

    @GetMapping("/municipios")
    public List<Municipio> obterMunicipios() {
        return ibgeClient.obterMunicipiosPorEstado("26");
    }

    @GetMapping("/exemplo")
    public String obterExemplo() {
        return exemploClient.obterExemplo();
    }
}
