package com.mycompany.javaexcessao;
import com.mycompany.javaexcessao.Excecao1;
import com.mycompany.javaexcessao.Excecao2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ExcecoesTeste {
    public class TesteExcecoes {
    public static void main(String[] args) {
        Excecao1 excecaoUm = new Excecao1("Exceção Um");
        Excecao2 excecaoDois = new Excecao2("Exceção Dois");

        try {
            excecaoUm.gerarExcecao();
        } catch (Excecao1 e) {
            System.out.println("Capturada: " + e.getMessage());
        }

        try {
            excecaoDois.gerarExcecao();
        } catch (Excecao2 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}

}
