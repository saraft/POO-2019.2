package com.company;
// Conta Corrente//
public class CC extends Conta {
    int numero;

   public String getTipo() {
        return "CC";
    }

    public void update() {
        this.saldo -= 20;
    }
    public CC(int numero){
        this.numero = numero;
    }

}
