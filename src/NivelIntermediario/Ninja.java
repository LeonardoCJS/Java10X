package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos: numerosMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numerosMissoesConcluidas;
    NivelNinja rank;
    // final nao podemos mudar o valor
    final double altura = 2.10;



    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de construtor voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numerosMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numerosMissoesConcluidas = numerosMissoesConcluidas;
        this.rank = rank;
    }

    // Todos os ninjas vao fazer obrigatoriamente
    final void tacarKunai(){
        System.out.println("Eu sou um metodo da classe mae");
    }

    // Criar um metodo publico personalizado
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface EstrategiaDeBatalha
    public void estrategiaNinja(){
        System.out.println("Essa é minha estrategia de batalha");
    }

    // Inteligencia de combate
    public void inteligenciaDeCombate(){
        System.out.println("Essa é minha inteligencia de batalha");
    }
    // Sobrecarga de metodo - Inteligencia de combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e voce é um genio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor!");
        } else{
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas estrategia!");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " eu sou da " + aldeia + " e tenho " + idade + " anos";
    }
}
