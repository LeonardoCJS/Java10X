package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {
        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        // Obj Uchiha
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 27;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }
}
