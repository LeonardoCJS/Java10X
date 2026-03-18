package NivelIntermediario;

import org.w3c.dom.ls.LSOutput;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numerosMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numerosMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da interface SharinganInterface
    * */
    public void SharinganAtivado(){
        System.out.println( nome + " o sharingan ativou, eu sou um Uchiha");
    }
}
