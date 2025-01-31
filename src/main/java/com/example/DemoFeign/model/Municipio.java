package com.example.DemoFeign.model;

public record Municipio(
        Integer id,
        String nome,
        Microrregiao microrregiao) {
}

record Microrregiao(
        Integer id,
        String nome) {
}
