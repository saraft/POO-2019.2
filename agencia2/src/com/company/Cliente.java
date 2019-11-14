package com.company;

import java.util.List;

public class Cliente {
    String nome;
    int id;
    List<Conta> contas;

    public Cliente(String nome, int id){
        this.id= id;
        this.nome= nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

      public void setContas(List<Conta> contas){
        this.contas = contas;
    }
}