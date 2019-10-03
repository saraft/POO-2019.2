package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Topique topique = new Topique(4,9);
        Scanner scanner = new Scanner(System.in);
        topique.Inserir(15,65,"João");
        System.out.println(topique.show());
        topique.remover(0);
        System.out.println(topique.show());
    }
}
