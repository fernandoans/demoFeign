package com.example.DemoFeign.client;

import com.example.DemoFeign.model.Estado;
import com.example.DemoFeign.model.Municipio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ibge-client", url = "http://servicodados.ibge.gov.br/api/v1/")
public interface IBGEClient {

    @RequestMapping(method = RequestMethod.GET, value = "localidades/estados")
    List<Estado> obterEstado();

    @RequestMapping(method = RequestMethod.GET, value = "localidades/estados/{uf}/municipios")
    List<Municipio> obterMunicipiosPorEstado(@PathVariable String uf);
}
