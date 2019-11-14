package com.company;

 public class Conta {
    double saldo = 0;
    String agencia;


     public String getTipo() {
         return "Conta";
     }


     public void sacar(double value) {
        if (saldo >= value) {
            this.saldo -= value;
        }
    }

    public void deposito(double value) {
        if (value != 0) {
            this.saldo += value;


        }
    }

    public void transfere(double value, Conta cdeposita) {
            if(value <= this.saldo){
                this.saldo -= value;
                cdeposita.deposito(value);
            }else {
                System.out.println("Falha, você não possui saldo suficiente.");
            }
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
         return saldo;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
}