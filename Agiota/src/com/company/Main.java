package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("### Funções do sistema\niniciar valor_saldo_inicial\ncadastrar nome_cliente id_cliente\nemprestar id_cliente saldo\nhistorico\nmostrarcliente nome_cliente\nreceber saldo nome_cliente");
        Sistema sistema = new Sistema(500);
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> Cliente = new HashMap<String, Double>();
        for (; ; ) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            try {
                if (ui[0].equals("finalizar")) {
                    break;
                } else if (ui[0].equals("iniciar")) {
                    sistema = new Sistema(Float.parseFloat(ui[1]));

                } else if (ui[0].equals("cadastrar")) {
                    String id = ui[1];
                    String nome = ui[2];
                   


                    sistema.cadastrar(new Cliente(nome, id));
                } else if (ui[0].equals("emprestar")) {
                    sistema.emprestar(ui[1], Float.parseFloat(ui[2]));

                } else if (ui[0].equals("historico")) {
                    for (Transacao transacao : sistema.getHistorico()) {
                        System.out.println("transacao");
                    }

                } else if (ui[0].equals("mostrarcliente")) {
                    sistema.mostrarClient(ui[1]);

                } else if (ui[0].equals("receber")) {
                    sistema.receber(Float.parseFloat(ui[2]), ui[1]);
                } else {
                    System.out.println("Falha:Comado invalido!");
                }

            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }

        }
    }
}

