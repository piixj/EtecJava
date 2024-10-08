package com.mycompany.javaexcessao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */


public class Excecao1 extends Exception {
    public Excecao1(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao() throws Excecao1 {
        throw new Excecao1("Esta é uma Exceção do Tipo Um!");
    }
}
