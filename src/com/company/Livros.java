package com.company;

import java.sql.SQLOutput;

public class Livros {
    int id;
    String nome;
    String autor;
    int qtdLeitores = 0;

    public Livros(int id,String nome, String autor){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }
//    public void setnome (String nome){
//        this.nome = nome;
//        System.out.println("Nome do livro alterado com sucesso!");
//    }
//    public void setautor(String autor){
//        this.autor = autor;
//        System.out.println("Autor do livro alterado com sucesso!");
//    }
    public String getnome(){
        return nome;
    }

    public void Emprestimo(){
        qtdLeitores +=1;
        System.out.println("Emprestimo efetuado com sucesso!");
    }
}

