package com.company;

import java.util.Map;

public class Cliente {
    String nome = "";

    String id = "";
    float saldo;


    public Cliente(String nome, String id){
        this.nome = nome;
        this.id = id;
        this.saldo = 0;
    }

    public String getNome(){
        return nome;
    }

    public String getId() {
        return id;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
}
