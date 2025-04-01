package com.example.demo.escolarestservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Professor;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class EscolaRestServices {

    // Lista genérica de Pessoas (Alunos e Professores)
    private List<Pessoa> pessoas = new ArrayList<>();

    // Endpoint para listar pessoas (alunos e professores)
    @GetMapping("/pessoas/listar")
    public List<Pessoa> getPessoas() {
        return pessoas;  // Retorna a lista de alunos e professores
    }

    // Endpoint para inserir aluno
    @PostMapping("/alunos/inserir")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
        // Validação de CPF
        if (!validarCPF(aluno.getCpf())) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        
        pessoas.add(aluno);  // Adiciona o aluno à lista de pessoas
        System.out.println("Aluno inserido: " + aluno);
        return aluno;  // Retorna o aluno inserido
    }

    // Endpoint para inserir professor
    @PostMapping("/professores/inserir")
    public Professor inserirProfessor(@RequestBody @Valid Professor professor) {
        // Validação de CPF
        if (!validarCPF(professor.getCpf())) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        pessoas.add(professor);  // Adiciona o professor à lista de pessoas
        System.out.println("Professor inserido: " + professor);
        return professor;  // Retorna o professor inserido
    }

    // Método de validação de CPF
    public static boolean validarCPF(String cpf) {
        // Expressão regular para verificar se o CPF tem 11 dígitos numéricos
        String regex = "^[0-9]{11}$";
        return cpf.matches(regex);
    }

    // Endpoint para alterar o nome de uma pessoa (Aluno ou Professor) se ela tiver mais de 18 anos
    @PostMapping("/pessoas/alterar-nome")
    public Pessoa alterarNome(@RequestBody @Valid Pessoa pessoa) {
        // Encontrar a pessoa na lista (baseado no CPF)
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(pessoa.getCpf())) {
                // Verificar se a pessoa tem mais de 18 anos
                if (p.getIdade() <= 18) {
                    throw new IllegalArgumentException("A pessoa deve ter mais de 18 anos para alterar o nome.");
                }

                if (p instanceof Aluno) {
                    // Lógica específica para alunos
                    System.out.println("Alterando nome de aluno: " + p.getNome());
                    p.setNome(pessoa.getNome());  // Tenta alterar o nome
                } else if (p instanceof Professor) {
                    // Lógica específica para professores
                    System.out.println("Alterando nome de professor: " + p.getNome());
                    p.setNome(pessoa.getNome());  // Tenta alterar o nome
                } else {
                    System.out.println("Tipo de pessoa desconhecido.");
                }
                System.out.println("Nome alterado para: " + pessoa.getNome());
                return p;
            }
        }
        throw new IllegalArgumentException("Pessoa não encontrada.");
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
