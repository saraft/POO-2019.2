package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
         for(;;){
             String line = scanner.nextLine();
             String ui[] = line.split(" ");
             try{
                 if(ui[0].equals("finalizar")){
                     break;
                 }else if(ui[0].equals("addUsuario")){
                     sistema.addUser(ui[1]);

                 } else if (ui[0].equals("mostrarUsuario")) {
                     System.out.println(sistema);

                 }else if(ui[0].equals("seguir")){
                     User um = sistema.getUser(ui[1]);
                     User dois = sistema.getUser(ui[2]);
                    um.seguir(dois);

                 }else if(ui[0].equals("twittar")){
                     String mensagem = "";
                     for (int i = 2; i < ui.length ; i++) {
                         mensagem += ui[i] + " ";
                         sistema.Twittar(ui[i],mensagem);

                     }
                 }else if(ui[0].equals("timeline")){
                     User usuario = sistema.getUser(ui[1]);
                     for (int i = 0; i < usuario.timeline.size(); i++) {
                         System.out.println(usuario.timeline.toString());
                         
                     }
                 }else if(ui[0].equals("meusTweets")){
                     User usuario = sistema.getUser(ui[1]);
                     for (int i = 0; i < usuario.meusTweets.size(); i++) {
                         System.out.println(usuario.meusTweets.toString());
                     }
                 }else if(ui[0].equals("unread")){
                     User usuario = sistema.getUser(ui[1]);
                     usuario.getClass();

                 }else if(ui[0].equals("getTweet")){
                     System.out.println(sistema.(Integer.parseInt(ui[1])));
                 }

             }
             catch (RuntimeException re){
                 System.out.println(re.getMessage());
             }
         }
    }
}
