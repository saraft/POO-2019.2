package com.company;

import java.util.Scanner;

public class Biblioteca {
    String nomebiblioteca;
    int id_add = 0;
    int id_finalL=100; // Defina aqui o tamanho da lista de livros
    Livros lista[]= new Livros[id_finalL];

    public Biblioteca(String nomebiblioteca) {
        this.nomebiblioteca = nomebiblioteca;
        System.out.println("Biblioteca criada!");
    }

    public int getultimoId(){
        return id_add-1;
    }

    public void setLivros(String nome, String autor){
        if(id_add==id_finalL){
            System.out.println("Fail: Lista de livros cheia!");
        }else {
            lista[id_add] = new Livros(id_add, nome, autor);
            id_add +=1;
            System.out.println("Livro adicionado!");
        }
    }

    public void mostraLivros(){
        if(id_add == 0){
            System.out.println("Fail: A biblioteca não possui livros!");
        }else{
            System.out.println("Lista livros!");
            for(int i = 0; i<id_add; i+=1){
                System.out.println(i + " - " + lista[i].getnome());
            }
        }
    }

    public void emprestaLivro(int id){
        lista[id].Emprestimo();
        System.out.println("Livro emprestado!");
    }
}

