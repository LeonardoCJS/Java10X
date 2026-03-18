package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }
    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("eu sou o " + nome + " e tenhi");
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {

    }
}
