package com.mycompany.main;

/**
 *
 * 
 */
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano){
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
    }
    
    public void acelerar (){
      System.out.println("O Astra esta acelerando");
    }
    
    public void frear (){
      System.out.println("O Astra esta freando");
    }
    
    public void informacoes (){
       System.out.println("O Veiculo: " + marca + " " + modelo + " " + ano);
    }

}

 
