package com.senai.atividade_api_rest_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")

public class Dev {
    @GetMapping
    public String dev(){
        return "Desenvolvedor: Clara Lemos";
    }
}
