package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarItem(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarItem(new Kunai("Kunai de Fumaça"));
        bolsaNinja.adicionarItem(new Shuriken(3));
        bolsaNinja.adicionarItem(new Shuriken(5));
        bolsaNinja.adicionarItem(new Pergaminho("Invocao do Sapo"));
        bolsaNinja.adicionarItem(new Pergaminho("Invocao da Cobra"));

        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarItens();
    }
}
