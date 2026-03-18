package NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama";
        hashirama.aldeia = "Aldeia da folha";
        hashirama.idade = 70;
        System.out.println("Nome: " + hashirama.nome);
        hashirama.sabedoriaHokages();
    }
}
