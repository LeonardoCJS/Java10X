package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico();
        naruto.nome = "Naruto";
        naruto.idade = 9;
        naruto.habilidade = TipoHabilidade.NINJUTSU;
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado itachi = new NinjaAvancado();
        itachi.nome = "itachi";
        itachi.idade = 20;
        itachi.habilidade = TipoHabilidade.KATON;
        itachi.especialidade = "Amaterasu";
        itachi.mostrarInformacoes();
        itachi.executarHabilidade();
    }
}
