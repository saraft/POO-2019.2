package com.company;

import java.util.ArrayList;

public class User {
    String id;
    int naolidos;
    ArrayList<User> seguidores;
    ArrayList<User> seguidos;
    ArrayList<Tweet> timeline;
    ArrayList<Tweet> meusTweets;

    public User(String id) {
        this.id = id;
        this.naolidos = 0;
        seguidores = new ArrayList<User>();
        seguidos = new ArrayList<User>();
        timeline = new ArrayList<Tweet>();
        meusTweets = new ArrayList<Tweet>();
    }

    public void seguir(User outros) {
        for (User usuario : seguidos) {
            if (usuario.id.equals(outros.id)) {
                this.seguidos.add(outros);
                outros.seguidores.add(this);
            }
        }
    }

    public boolean Twittar(Tweet tweet) {
        this.meusTweets.add(tweet);
        this.timeline.add(tweet);
        for (User e : seguidores) {
            e.naolidos++;
            e.timeline.add(tweet);
        }
        return true;
    }

    public void darlike(int idTw) {
        for (Tweet l : timeline) {
            if (l.likes.contains(new User(this.id))) {
                throw new RuntimeException("Falha: Usuario já deu like!");
            }
            for (Tweet t : timeline) {
                if (t.id == idTw) {
                    t.likes.add(new User(id));
                }

            }
        }
    }

    public Tweet unread() {
        if (this.naolidos != 0) {
            for (int i = 0; i < this.naolidos; i++) {
                return timeline.get(i);
            }
            this.naolidos = 0;
        }
        throw new RuntimeException("Falha:sem novos tweets!");
    }

    public String toString() {
        String saida = id + "\n";
        saida += "Seguidos: [ ";
        for (User usuario : seguidos)
            saida += usuario.id + " ";
        saida += "]\nSeguidores: [ ";
        for (User usuario : seguidores)
            saida += usuario.id + " ";
        saida += "] \n";
        return saida;
    }
}
