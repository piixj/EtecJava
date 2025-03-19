package com.example.demo.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1")
public class AlunosRestServices {

    @Autowired

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João15", 15, "sasa"));
        alunos.add(new Aluno("João16", 16, "sas"));
        alunos.add(new Aluno("João17", 17, "asassa"));
        return alunos;
    }

    @PostMapping("/alunos")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {        
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }
}