package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Digite o nome da biblioteca: ");
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(sc.nextLine());
        biblioteca.setLivros("A hora da estrela", "Clarice Lispector");
        biblioteca.mostraLivros();
        System.out.println("Ultimo id adicionado é " + biblioteca.getultimoId());

    }
}
