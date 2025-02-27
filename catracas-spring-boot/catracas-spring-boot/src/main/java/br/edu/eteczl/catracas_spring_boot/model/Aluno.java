package br.edu.eteczl.catracas_spring_boot.model;

public class Aluno {
    String nome;
    Integer idade;

    public String getNome() {
        return nome;
    }  
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    } 
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
