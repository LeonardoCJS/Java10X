package NivelIntermediario.ClassesAbstratas;

public abstract class Hokages extends Ninja {
    boolean vivoOuNao;

    public abstract void sabedoriaHokages();

    // No args constructor
    public Hokages() {
        // Construtor vazio, sem argumentos
    }

    // All args constructor
    // Construtor com argumentos
    public Hokages(String nome, String aldeia, int idade, boolean vivoOuNao) {
        this.nome = nome; // Seu atributo esta recebendo o valor do parametro
        this.aldeia = aldeia;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
