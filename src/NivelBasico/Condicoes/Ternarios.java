package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: São manerias de reduzir o codigo
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        */

        short numeroMissoes = 11;
        String nivel = (numeroMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja esta com menos de 10 missoes";
        System.out.println(nivel);
    }
}
