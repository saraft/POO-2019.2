package com.company;

import com.sun.jdi.Value;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o saldo da conta poupança:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Digite o saldo da conta corrente:");
        Scanner scanner1 = new Scanner(System.in);
        String s1 = scanner.nextLine();

        Conta c = new Conta();
        Conta cp = new CP(4538);
        Conta cc = new CC(400);
        cp.deposito(Double.parseDouble(s));
        cc.deposito(Double.parseDouble(s1));
        cc.transfere(450, cp);

        System.out.println(cc.getSaldo()+" e "+cp.getSaldo());



    }
}