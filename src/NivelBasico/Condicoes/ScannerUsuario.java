package Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        /*
         * Scanner é um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados
         */
        // Abrir o Scanner
        Scanner sc = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Digite o nome do ninja: ");
        String nomeNinja = sc.nextLine();

        // Receber a idade do ninja
        System.out.println("Digite a idade do ninja: ");
        int idadeNinja = sc.nextInt();

        // Mostrando informações para o usuario
        System.out.println("Nome: " + nomeNinja);
        System.out.println("Idade: " + idadeNinja + " anos");

        // Tratamento de dados
        if (idadeNinja >= 18){
            System.out.println("Esse ninja ja é maior de idade, e pode ir para missoes fora da aldeia");
        }else{
            System.out.println("Esse ninja é muito novo, precisa treinar para missoes fora da aldeia");
        }

        // Fechar sempre o Scanner
        sc.close();
    }
}
