package com.company;

public class Transacao {
    int id;
    float valor;
    String clienteId;

    public Transacao(int id,float valor,String clienteId){
        this.id = id;
        this.valor = valor;
        this.clienteId = clienteId;
    }

    public String toString() {
        return ""+id + ":"+ valor +":"+ clienteId;
    }
}
