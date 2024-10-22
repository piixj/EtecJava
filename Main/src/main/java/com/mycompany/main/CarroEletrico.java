package com.mycompany.main;

/**
 *
 * 
 */
public class CarroEletrico {
    protected String carro;
    protected String modelo;
    protected int ano;
    protected String combustivel;
    
    public CarroEletrico (String carro, String modelo, int ano, String combustivel){
       this.carro = carro;
       this.modelo = modelo;
       this.ano = ano;
       this.combustivel = combustivel;
    }
    
    public void acelerar (){
       System.out.println("O carro esta acelerando");
    }
    
    public void frear (){
       System.out.println("Voce esta freando o carro");
    }
    
    public void carregar (){
        System.out.println("O carro esta carregado 100%");
    }
    
    public void informacoes(){
       System.out.println("O carro eletrico: " + carro + " " + modelo + " " + ano);
    } 
}

