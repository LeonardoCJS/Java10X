package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        valor = valor * 0.99;
        saldo = saldo + valor;
    }
}
