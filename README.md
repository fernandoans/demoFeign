# Projeto DemoFeign - Para Spring Boot Cloud Feign

Neste projeto buscaremos de 2 lugares:
- Dados do IBGE
- De outro Microserviço

## Classe Record (Java 16)

1. Java Record é uma classe especial que auxilia no encapsulamento relacionado a dados sem a necessidade para "boilerplate" (são seções de código que é repetido em muitos lugares com um mínimo de variação, a solução era mover isso para uma Classe abstrata).
2. Classe Record é usado como solução DTO (Data Transfer Object) em aplicações Spring Boot como uma solução eficiente para o encapsulamento de transferência de dados entre as camadas.
3. Records são conscisos, imutáveis e automaticamente implementam métodos construtores, getter(), equals(), hashCode() e toString() que são essenciais para DTO. 

## Execução

Primeiro execute o MicroServiço DemoAutentica disponível em https://github.com/fernandoans/demoAutentica.
