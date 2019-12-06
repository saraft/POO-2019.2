package com.company;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sistema {
    int nextTwId = 0;

    SortedMap<String,User> users  = new TreeMap<String,User>();

    SortedMap<String,Tweet> tweets = new TreeMap<String,Tweet>();

    public void setUsers(SortedMap<String, User> users) {
        this.users = users;
    }

    public Sistema(int nextTwId){
        this.nextTwId = nextTwId;
        users = new TreeMap<String,User>();
        tweets = new TreeMap<String, Tweet>();

    }
    public void addUser(String id){
        User usuario= users.get(id);
        if(usuario == null){
            users.put(id,new User(id));
        }
    }

    public User getUser(String id) {
       User usuario = users.get(id);
        if (usuario == null)
                throw new RuntimeException("fail: usuario nao encontrado");
        return usuario;
    }
    public void Twittar(String id, String texto){
        getUser(id);
        Tweet novo = new Tweet(this.nextTwId,id,texto);
        this.nextTwId++;
        users.get(id).Twittar(novo);
        tweets.put(id,novo);
    }
    
    public String toString() {
        String saida = "";
        for (User usuario : users.values())
            saida += usuario + "\n";
        return saida;
    }
}
