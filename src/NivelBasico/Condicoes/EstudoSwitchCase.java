package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
         * SwitchCases: Servem para gerar casos especificos
         * Objetivo: Pedir para o usuario escolher entre ninjas
        */
        Scanner sc = new Scanner(System.in);

        // Mostrar opções para usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto");
        System.out.println("2- Sasuke");
        System.out.println("3- Sakura");
        // Pedir para o usuario escolher uma das opções
        System.out.print("Digite uma opção: ");
        int opcao = sc.nextInt();
        System.out.println("Voce digitou: " + opcao);
        // Reação ao escolher um personagem
        switch (opcao) {
            case 1:
                System.out.println("Sua escolha foi Naruto");
                break;
            case 2:
                System.out.println("Sua escolha foi Sasuke");
                break;
            case 3:
                System.out.println("Sua escolha foi Sakura");
                break;
            // Caso a opção digitada seja invalida
            default:
                System.out.println("Opção invalida");
        }
        sc.close();
    }
}
