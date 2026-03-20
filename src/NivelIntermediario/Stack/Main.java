package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // Sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";

        // List
        // Sao dinamicas e tamanho aumenta e diminui conforme precisamos
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        // Colocar elemento na pilha
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Kakashi");
        ninjaStack.push("Hinata");
        System.out.println("Minha Stack atual: " + ninjaStack);
        // Retira o ultimo elemento que entrou
        ninjaStack.pop();
        System.out.println("Minha Stack atualizada com Pop: " + ninjaStack);
        // Mostrar o proximo elemento do topo da lista
        System.out.println("Minha Stack com o proximo elemento do topo: " + ninjaStack.peek());

        // Mostra o tamanho da Stack
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos");

    }
}
