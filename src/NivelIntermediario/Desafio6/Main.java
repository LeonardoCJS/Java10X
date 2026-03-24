package NivelIntermediario.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Iniciar uma Linked list com 7 ninjas
        Ninja naruto = new Ninja("Naruto", "Aldeia da folha", 17);
        Ninja sasuke = new Ninja("Sasuke", "Aldeia da folha", 18);
        Ninja sakura = new Ninja("Sakura", "Aldeia da folha", 19);
        Ninja kakashi = new Ninja("Kakashi", "Aldeia da folha", 25);
        Ninja itachi = new Ninja("Itachi", "Aldeia da folha", 22);
        Ninja shikamaru = new Ninja("Shikamaru", "Aldeia da folha", 20);
        Ninja ino = new Ninja("Ino", "Aldeia da folha", 16);
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(naruto);
        ninjas.add(sasuke);
        ninjas.add(sakura);
        ninjas.add(kakashi);
        ninjas.add(itachi);
        ninjas.add(shikamaru);
        ninjas.add(ino);


        // Listar os ninjas
        System.out.println(ninjas);

        System.out.println("--------Lista de ninjas--------");
        // Complexidade o(n)
        for (Ninja ninja : ninjas){
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        Ninja hashirama = new Ninja("Hashirama", "Aldeia da folha", 70);
        ninjas.addFirst(hashirama);

        // Listar os ninjas
        System.out.println("--------Lista de ninjas--------");
        // Complexidade o(n)
        for (Ninja ninja : ninjas){
            System.out.println(ninja);
        }


        // Remover o ninja no inicio da List
        ninjas.removeFirst();

        // Listar os ninjas
        System.out.println("--------Lista de ninjas--------");
        // Complexidade o(n)
        for (Ninja ninja : ninjas){
            System.out.println(ninja);
        }
        // Procurar ninja por indice
        Ninja terceriroNinja = ninjas.get(2);

        System.out.println("--------Procurar por indice--------");
        System.out.println(terceriroNinja);
    }
}
