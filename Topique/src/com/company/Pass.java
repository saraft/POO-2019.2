package com.company;

public class Pass {
    int id;
    String nome;
    int idade;

    public Pass(int id, String nome,int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public String toString(){
        return id +":"+nome+":"+idade;
    }
    public boolean preferencial(){
        return idade >=60;
    }
}
