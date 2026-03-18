package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        System.out.println("-Naruto-");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 16, 30, NivelNinja.GENIN, Biju.KURAMA);
        System.out.println(naruto);

        System.out.println("---------------------");

        System.out.println("-Sasuke-");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        System.out.println(sasuke);
        sasuke.habilidadeEspecial();
    }
}
