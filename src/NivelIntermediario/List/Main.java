package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(i + "- " + ninjasArray[i]);
        }

        // List
        // Listas nao sao estaticas, elas podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); // index 0
        ninjasList.add("Sasuke Uchiha"); // index 1
        ninjasList.add("Sakura Haruno"); // index 2
        ninjasList.add("Tobirama Senju"); // index 3
        // Adcionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        ninjasList.add(3, "Tobirama");
        System.out.println("ninjasList = " + ninjasList);

        ninjasList.remove(3);
        System.out.println("ninjasList = " + ninjasList);

        // Ver o tamanho da Lista
        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");
    }
}
