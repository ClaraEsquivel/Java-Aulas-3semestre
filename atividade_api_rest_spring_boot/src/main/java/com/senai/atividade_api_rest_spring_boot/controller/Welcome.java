package com.senai.atividade_api_rest_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {

    @GetMapping
    public String welcome(){
        return "Bem-vindo a atividade: API Rest Spring Bot";
    }
}
