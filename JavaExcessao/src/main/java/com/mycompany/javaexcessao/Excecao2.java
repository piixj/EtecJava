package com.mycompany.javaexcessao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class Excecao2 extends Exception {
    public Excecao2(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao() throws Excecao2 {
        throw new Excecao2("Esta é uma Exceção do Tipo Dois!");
    }
}
