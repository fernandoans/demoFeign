# Projeto DemoFeign - Para Spring Boot Cloud Feign

Neste projeto buscaremos de 2 lugares:
- Dados do IBGE:
  - Listagem com todos os estados do Brasil.
  - Listagem com todos os municípios do Estado de Pernambuco.
- De outro Microserviço:
  - Exemplo para um serviço que exige autenticação.

## Spring Cloud Feign

Tratado como um cliente HTTP declarativo com o objetivo de simplificar a integração entre serviços, principalmente
na arquiteturas de microsserviços. Foi desenvolvido pela Netflix e integrado ao ecossistema Spring Cloud, permite 
a criação de interfaces Java com anotações que abstraem detalhes de comunicação REST, como URLs, métodos HTTP e 
parâmetros. Ao utilizar anotações como @FeignClient, são definidos contratos para chamadas a APIs externas sem 
necessitar implementar código manual para requisições HTTP, serialização ou desserialização. 

O Feign integra-se naturalmente com o Spring Cloud Load Balancer (substituto do Ribbon) e o Eureka para service 
discovery, garante balanceamento de carga e resolução dinâmica de endereços. Reduz a complexidade do código, 
torna as chamadas entre serviços mais legíveis e mantém a coesão das práticas do Spring Boot.

## Classe Record (Java 16)

1. Java Record é uma classe especial que auxilia no encapsulamento relacionado a dados sem a necessidade para "boilerplate" (são seções de código que é repetido em muitos lugares com um mínimo de variação, a solução era mover isso para uma Classe abstrata).
2. Classe Record é usado como solução DTO (Data Transfer Object) em aplicações Spring Boot como uma solução eficiente para o encapsulamento de transferência de dados entre as camadas.
3. Records são conscisos, imutáveis e automaticamente implementam métodos construtores, getter(), equals(), hashCode() e toString() que são essenciais para DTO. 

## Execução

Primeiro executar o MicroServiço DemoAutentica disponível em https://github.com/fernandoans/demoAutentica.

## Modo de usar

Subir o serviço com:
```
$ ./mvnw spring-boot:run
```

Chamar os serviços com o CURL:
```
$ curl -H http://localhost:8080/exemplofeign/estados
$ curl -H http://localhost:8080/exemplofeign/municipios
$ curl -H http://localhost:8080/exemplofeign/exemplo
```