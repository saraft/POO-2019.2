package com.company;
//Conta Poupança//
public class CP extends Conta {
    int numero;

    public String getTipo() {
        return "CP";
    }

    public void update() {
        this.saldo +=0.10;

    }
    public CP(int numero){
        this.numero = numero;
    }
}
