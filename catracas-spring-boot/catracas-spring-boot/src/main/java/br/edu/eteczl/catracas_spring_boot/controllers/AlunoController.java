package br.edu.eteczl.catracas_spring_boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aluno")
public class AlunoController {
    
    @RequestMapping("/get")
    public String getAluno() {
        return " Olá Aluno ";
    }

}
