package com.example.demo.model;

public class Aluno {
    
    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não pode ser branco")
    private String nome;
    
    @NotBlank(message = "Idade não pode ser nula")
    private Integer idade;

    @CPF(message = "Cpf inválido")
    @NotNull(message = "Cpf não pode ser nulo")
    @NotBlank(message = "Cpf não pode ser branco")
    private String cpf;

    public Aluno() {        
    }

    public Aluno(String nome,Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome; 
    }

    public Integer getIdade() {
        return idade;
    } 

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf; 
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}