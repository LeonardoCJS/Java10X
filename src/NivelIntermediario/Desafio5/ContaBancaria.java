package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public abstract void depositar(double valor);
}
