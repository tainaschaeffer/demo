package com.example.demo.controller;

import com.example.demo.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private Login login;

    @GetMapping("/before")
    public String loginBefore() {
        login.metodoBefore();
        return "Método 'before' executado.";
    }

    @GetMapping("/after")
    public String loginAfter() {
        login.metodoAfter();
        return "Método 'after' executado.";
    }

    @GetMapping("/around")
    public String loginAround() {
        login.metodoAround();
        return "Método 'around' executado.";
    }
}
