package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição:Vão repetir infinitamente ou ate voce atingir o parametro desejado
        * While
        * For
        */

        // While
        // while(condição) {tudo vai acontecer}
        int numeroClones = 0;
        int maxClones = 40;

        while (numeroClones < maxClones){
            numeroClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroClones);
        }

        // For
        for (int i = 0; i < maxClones; i++) {
            System.out.println("O Naruto fez um clone das sombras " + i);
        }
    }
}
