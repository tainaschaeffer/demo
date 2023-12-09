package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Login {

    // Método para ser monitorado pelo aspecto 'before'
    public void metodoBefore() {
        System.out.println("Executando o corpo do método 'metodoBefore'");
        // Aqui você pode adicionar a lógica específica do método
    }

    // Método para ser monitorado pelo aspecto 'after'
    public void metodoAfter() {
        System.out.println("Executando o corpo do método 'metodoAfter'");
        // Aqui você pode adicionar a lógica específica do método
    }

    // Método para ser monitorado pelo aspecto 'around'
    public void metodoAround() {
        System.out.println("Executando o corpo do método 'metodoAround'");
        // Aqui você pode adicionar a lógica específica do método
    }
}
