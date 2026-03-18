package Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        * IF e ELSE - Condições
        * else if
        * Objetivo: Passa o ninja de nivel de acordo com o numero de missoes
        */
        // Ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 21;
        boolean hokage = false;
        short numeroMissoes = 100;

        /*
         * se(condição){faça isso}
         * if(condição){resultado}
         * else if(condição){resultado}
         * else{resultado}
         */
        if (numeroMissoes >= 100 && idade > 20){
            hokage = true;
            System.out.println("Rank: Hokage");
        }else if(numeroMissoes >= 20 && idade > 15){
            System.out.println("Rank: Jounnin");
        }else if(numeroMissoes >= 10 && idade > 12){
            System.out.println("Rank: Chunnin");
        }else{
            System.out.println("Rank: Gennin");
        }
    }
}
