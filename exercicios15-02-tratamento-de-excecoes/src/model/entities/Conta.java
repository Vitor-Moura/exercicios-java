package model.entities;

import model.exceptions.BusinessException;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposit(double amount) {
        saldo += amount;
    }

    public void saque(double valor) {
        validaSaque(valor);
        saldo -= valor;
    }

    private void validaSaque(double valor) {
        if (valor > getLimiteDeSaque()) {
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if (valor > getSaldo()) {
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }
}
