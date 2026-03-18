package NivelIntermediario;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numerosMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numerosMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numerosMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numerosMissoesConcluidas, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }

}
