package com.mycompany.main;

/**
 *
 * 
 */
public class Carro {
    String marca;
    String modelo;
    int ano;
    String combustivel;
   
   public Carro (String marca, String modelo, int ano, String combustivel){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.combustivel = combustivel;
   }
   
   public void acelerar () {
    System.out.println("O carro esta acelerando com" + combustivel + ".");
   }
   
   public void frear (){
       System.out.println("O carro esta freando");
   }
   
   public void informacoes (){
       System.out.println("O Carro: " + marca + " " + modelo + " " + ano);
   }
}



