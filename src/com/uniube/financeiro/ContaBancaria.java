package com.uniube.financeiro;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;
    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor < saldo){
            saldo -= valor;
        } else{
            limiteCredito -= valor;
        }
    }
}
