package com.company;

import java.util.ArrayList;

public class Tweet {
    int id = 0;
    String idUser;
    String mensagem;
    ArrayList<User> likes;

    public Tweet(int idTw, String idUser, String mensagem) {
        this.id = idTw;
        this.idUser = idUser;
        this.mensagem = mensagem;
        likes = new ArrayList<User>();
    }

    public void darLike(String idUser) {
        for (User e : likes) {
            if (e.id.equals(id)) {
                throw new RuntimeException("Falha:user ja deu like nesse tweet!");
            }
            likes.add(new User(idUser));
        }
    }

    public String toString() {
        String saida = id + ":" + this.idUser + ":" + "(" + mensagem + ")";
        return saida;
    }
 }
