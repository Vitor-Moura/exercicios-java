package entities;

public class Ex01Conta {

    private int numero;
    private String titular;
    private double saldo;


    public Ex01Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public Ex01Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Conta " + numero +
                ", Titular: " + titular +
                ", Saldo: $ " + saldo;
    }
}
