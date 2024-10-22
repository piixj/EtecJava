/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pesquisaarrayvetor;

import java.util.Scanner;

/**
 *
 * @author DANNY
 */
public class TesteArray {
   private static final String[] tasks = new String[10];
    private static int taskCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 4);
        scanner.close();
    }
    private static void addTask(Scanner scanner) {
        if (taskCount < tasks.length) {
            System.out.print("Digite a tarefa: ");
            String task = scanner.nextLine();
            tasks[taskCount] = task;
            taskCount++;
            System.out.println("Tarefa adicionada com sucesso!");
        } else {
            System.out.println("Lista de tarefas cheia!");
        }
    }
    private static void listTasks() {
        if (taskCount == 0) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }
    private static void removeTask(Scanner scanner) {
        listTasks();
        if (taskCount > 0) {
            System.out.print("Digite o número da tarefa para remover: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < taskCount) {
                for (int i = index; i < taskCount - 1; i++) 
                    tasks[i] = tasks[i + 1];
                }
                tasks[taskCount - 1] = null; // Limpar a última tarefa
                taskCount--;
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número da tarefa inválido.");
            }
        }
    }
