package NivelIntermediario.RevisaoEstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        * Array sao estaticos, exigem um tamanho pre definido
        *
        * List sao dinamicas, aumentam e dimiuem de tamanho conforme precisamos
        *
        * Stacks sao unicos, exigem uma ordem! O ultimo a entrar é o primeiro a sair!
        * */

        // Arrays
        String[] nomeNinjaArray = new String[3];
        System.out.println("------------------Array-------------------");
        nomeNinjaArray[0] = "Naruto";
        nomeNinjaArray[1] = "Sasuke";
        nomeNinjaArray[2] = "Sakura";
        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[0]);

        // List é um pouco mais lenta em comparação com Array
        System.out.println("------------------List-------------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto");
        nomeNinjaList.add("Sasuke");
        nomeNinjaList.add("Sakura");
        nomeNinjaList.add("Itachi");
        nomeNinjaList.add("Madara");
        System.out.println("nomeNinjaList = " + nomeNinjaList);

        System.out.println("------------------Stack-------------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto");
        nomeNinjaStack.push("Sasuke");
        nomeNinjaStack.push("Sakura");
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/Stack = " + nomeNinjaStack.pop());
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        System.out.println("Ninja no topo(sem remover) = " + nomeNinjaStack.peek());
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
    }
}
