package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------- Naruto --------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 17, 30, 1.68);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Meu nome é " + naruto.getNome());


        System.out.println("-------- Sasuke --------");
    }
}
