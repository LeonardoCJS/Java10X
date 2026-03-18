package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que ser digitado aqui dentro do comando PSVM sera compilado pelo java
        /*
         * Dados não primitivos - String, Array, Class, enun, Interfaces, Objects
         * Objetivo: Criar um ninja, e atribuir metodos a ele
        */
        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em CapsLock
        System.out.println("Esse texto esta em CapsLock: " + nomeToUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLowerCase = aldeia.toLowerCase(); // toLowerCase vai colocar tudo em minusculo
        System.out.println("Esse texto esta em caixa baixa: " + aldeiaToLowerCase);
        System.out.println("Esse texto esta normal: " + aldeia);
    }
}
