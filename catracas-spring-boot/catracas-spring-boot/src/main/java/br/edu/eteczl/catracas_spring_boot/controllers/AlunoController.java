package br.edu.eteczl.catracas_spring_boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {
    
    @RequestMapping("/get")
    public String getAluno(@RequestParam String nome) {
        return " Olá Aluno " + nome;
    }

}
