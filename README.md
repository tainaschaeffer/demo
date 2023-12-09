# Disciplina de Engenharia de Software Orientada a Aspectos

## Interesse transversal utilizado: logging

## Requisitos
- Java 11
- Spring Boot

## Estrutura:
```src/
|-- main/
    |-- java/
        |-- com/
            |-- example/
                |-- demo/
                    |-- aspect/
                        |-- LoggingAspect.java
                    |-- service/
                        |-- Login.java
                    |-- controller/
                        |-- LoginController.java
    |-- resources/
|-- test/
```

## Local da aplicação
http://localhost:8080/

## Rotas
- /login/after
- /login/before
- /login/around

## Como rodar a aplicação?
- No diretório do projeto rodar o comando:
```
mvn spring-boot:run -Dspring-boot.run.arguments=--debug
```