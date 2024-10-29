/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vetorarraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class VetorArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
        int i;
        
        System.out.println("Insira 10 números inteiros:");

        for ( i = 0; i < 10; i++) {
            System.out.print("Informe o valor da reposição" + (i + 1) + ": ");
            v[i] = scanner.nextInt();
        }

        int soma = 0;
        int maior = v[0];
        int menor = v[0];
            
        for (int numero : v) {
            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        System.out.println("\nValores inseridos:");
        for (int numero : v) {
            System.out.print(numero);
            if (numero == maior) {
                System.out.print(" (maior)");
            } 
            if (numero == menor) {
                System.out.print(" (menor)");
            }
            System.out.println();
        }

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");

        System.out.println("\nLista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove(2); 
        System.out.println("\nLista de frutas após remoção da terceira:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        
        System.out.print("\nDigite o nome de uma fruta para buscar: ");
        String frutaBuscar = scanner.next();
        boolean encontrada = buscarFruta(frutas, frutaBuscar);
        if (encontrada) {
            System.out.println("A fruta " + frutaBuscar + " está na lista.");
        } else {
            System.out.println("A fruta " + frutaBuscar + " não está na lista.");
        }

        
        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        System.out.println("\nAdicione números inteiros para ordenar. Insira 5 números:");
        for ( i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosInteiros.add(scanner.nextInt());
        }

        Collections.sort(numerosInteiros);
        System.out.println("Números em ordem crescente: " + numerosInteiros);

       
        int contagemPares = contarPares(numerosInteiros);
        System.out.println("Quantidade de números pares: " + contagemPares);

        scanner.close();
    }

    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static int contarPares(ArrayList<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}