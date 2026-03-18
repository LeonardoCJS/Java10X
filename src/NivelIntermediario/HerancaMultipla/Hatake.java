package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void sharinganAtivado(){
        System.out.println("Meu nome é " + nome + " e meu sharingan ativou!");
    }

    public void ninjaDeElite(){
        System.out.println("Meu nome é " + nome + " eu sou um ninja de elite");
    }

    public void boasVindas(){
        System.out.println(nome + " eu sou um Hatake");
    }
}
