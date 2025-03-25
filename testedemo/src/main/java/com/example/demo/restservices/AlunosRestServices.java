package com.example.demo.restservices;

import java.util.ArrayList;
import java.util.List;

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
    
    List<Aluno> alunos = new ArrayList<>();
    @GetMapping("/alunos/listar")
    public List<Aluno> getAlunos() {
        alunos.add(new Aluno("João15", 15, "468.697.280-97"));
        alunos.add(new Aluno("João16", 16, "186.177.280-78"));
        alunos.add(new Aluno("João17", 17, "580.032.490-58"));
        return alunos;
    }

    @PostMapping("/alunos/inserir")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {        
        alunos.add(aluno);
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }
}