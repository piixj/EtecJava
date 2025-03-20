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

<<<<<<< HEAD
import jakarta.validation.Validator;
=======
import jakarta.validation.Valid;

>>>>>>> e0d55935a91e0f594389a65713e1223a38ab546b

@RestController
@RequestMapping("/api/v1")
public class AlunosRestServices {

    @Autowired

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
<<<<<<< HEAD
        alunos.add(new Aluno("João15", 15, "468.697.280-97"));
        alunos.add(new Aluno("João16", 16, "186.177.280-78"));
        alunos.add(new Aluno("João17", 17, "580.032.490-58"));
=======
        alunos.add(new Aluno("João15", 15, "sasa"));
        alunos.add(new Aluno("João16", 16, "sas"));
        alunos.add(new Aluno("João17", 17, "asassa"));
>>>>>>> e0d55935a91e0f594389a65713e1223a38ab546b
        return alunos;
    }

    @PostMapping("/alunos")
<<<<<<< HEAD
    public Aluno inserirAluno(@RequestBody Aluno aluno) {        
=======
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {        
>>>>>>> e0d55935a91e0f594389a65713e1223a38ab546b
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }
}