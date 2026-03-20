package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja ninja = new Ninja("Naruto", "naruto@gmail.com", 999999999);
        System.out.println("Ninja: " + ninja);

        NinjaRecord ninjaRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 1111111111);
        System.out.println("Ninja: " + ninjaRecord);
        System.out.println(ninjaRecord.emailCaixaAlta());


    }
}
