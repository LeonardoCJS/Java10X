package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.00);
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.00);
        contaPoupanca.depositar(500);
        contaPoupanca.consultarSaldo();
    }
}
