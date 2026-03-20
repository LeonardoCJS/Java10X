package NivelIntermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[6];

        // List
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // Queue
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no head: " + ninjasQueue.peek());

        // Adicionar a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila: " + ninjasQueue);


        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        // Verificar se esta vazia a fila
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }
    }
}
