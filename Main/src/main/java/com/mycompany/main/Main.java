package com.mycompany.main;

/**
 *
 * 
 */
public class Main {
    public static void main(String[] args){
              //Istancias do Veiculo
              Veiculo veiculo = new Veiculo("Astra", "Chevrolet", 2011);
              veiculo.acelerar();
              veiculo.frear();
              veiculo.informacoes();
              
              System.out.println();
              
              //Instancia do Carro
              Carro carro = new Carro("Civic", "G10", 2017, "Gasolina");
              carro.acelerar();
              carro.frear();
              carro.informacoes();
              
              System.out.println();
              
              //Instancias do CarroEletrico
              CarroEletrico carroEletrico = new CarroEletrico("Volvo", "EX30", 2023, "100%");
              carroEletrico.acelerar();
              carroEletrico.frear();
              carroEletrico.carregar();
              carroEletrico.informacoes();
    }
}
