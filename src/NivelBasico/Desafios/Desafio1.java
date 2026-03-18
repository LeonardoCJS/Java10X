package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 18;
        String missaoNinja1 = "Missao Uzumaki";
        char nivelDificuldade1 = 'S';
        String staus1 = "";

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 13;
        String missaoNinja2 = "Missao Uchiha";
        char nivelDificuldade2 = 'D';
        String staus2 = "";

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 13;
        String missaoNinja3 = "Missao Haruno";
        char nivelDificuldade3 = 'S';
        String staus3 = "";

        // Verifica idade do ninja se for MENOR que 15 entra no bloco if
        if (idadeNinja1 < 15){
            // Verifica o nivel da missao que ninjas menores de 15 podem concluir
            if (nivelDificuldade1 == 'D' || nivelDificuldade1 == 'C'){
                staus1 = "Concluido";
            }else{
                staus1 = "Nao concluido";
            }
        }else{
            staus1 = "Concluido";
        }
        if (idadeNinja2 < 15){
            if (nivelDificuldade2 == 'D' || nivelDificuldade2 == 'C'){
                staus2 = "Concluido";
            }else{
                staus2 = "Nao concluido";
            }
        }else{
            staus2 = "Concluido";
        }
        if (idadeNinja3 < 15){
            if (nivelDificuldade3 == 'D' || nivelDificuldade3 == 'C'){
                staus3 = "Concluido";
            }else{
                staus3 = "Nao concluido";
            }
        }else{
            staus3 = "Concluido";
        }

        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Nivel dificuldade: " + nivelDificuldade1);
        System.out.println("Concluida: " + staus1);
        System.out.println("---------------------------------------");

        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Nivel dificuldade: " + nivelDificuldade2);
        System.out.println("Concluida: " + staus2);
        System.out.println("---------------------------------------");

        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Nivel dificuldade: " + nivelDificuldade3);
        System.out.println("Status: " + staus3);
        System.out.println("---------------------------------------");
    }
}
