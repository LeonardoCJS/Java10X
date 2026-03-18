package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Fazer o Array
        int numeroMaximo = 3;
        String[] ninjas = new String[numeroMaximo];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            // Menu
            System.out.println("\n ===== Menu Ninjas =====");
            System.out.println("1- Cadastrar Ninja");
            System.out.println("2- Listar Ninjas");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numeroMaximo) {
                        System.out.println("Digite o nome do ninja: ");
                        String nome = sc.next();
                        ninjas[ninjasCadastrados] = nome;
                        // Somando mais um ninja na minha lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrada com sucesso!");
                    }else {
                        System.out.println("A lista de ninjas esta cheia.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja foi encontrado.");
                    }else{
                        System.out.println("\n ===== Menu Ninjas =====");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println("Ninja: " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
