package com.company;
import java.util.ArrayList;


public class Sistema {
    float valor;
    float saldo;
    String clienteId;
    ArrayList<Cliente> clientes;
    ArrayList<Transacao> transacoes;
    int nextTransacoesId;


    public Sistema(float saldo) {
        this.saldo = saldo;
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Transacao>();
        this.nextTransacoesId = 0;
    }

    public void cadastrar(Cliente cliente) {
        if (cliente.getId() != "" && cliente.getNome() != "") {

            if(searchCliId(cliente.getId()) == -1){
                clientes.add(cliente);
                System.out.println("Cadastrado com sucesso!");
            }else{
                System.out.println("Falha : O cliente ja existe!");
            }
        } else {
            System.out.println("Não é possível cadastrar!");

        }
    }

    public void addTrasacao(float valor, String clienteId) {
        this.transacoes.add(new Transacao(nextTransacoesId, valor, clienteId));
        nextTransacoesId += 1;
    }

    public void emprestar(String clienteId, float saldo) {
        int indice = searchCli(clienteId);
        if (indice != -1) {
            if (this.saldo > saldo) {
                clientes.get(indice).setSaldo(saldo);
                Transacao tran = new Transacao(nextTransacoesId, saldo, clientes.get(indice).getId());
                nextTransacoesId += 1;
                transacoes.add(tran);
            } else {
                System.out.println("Fail: O saldo é insuficiente!");
            }
        } else {
            System.out.println("Fail: Cliente não existe!");
        }
    }

    public int searchCli(String cliente) {
        for (int i = (clientes.size()-1); i >= 0; i--) {
            if ((clientes.get(i)).getNome().equals(cliente)) {
                return i;
            }
        }
        return -1;
    }

    public int searchCliId(String cliente) {
        for (int i = (clientes.size()-1); i >= 0; i--) {
            if ((clientes.get(i)).getId().equals(cliente)) {
                return i;
            }
        }
        return -1;
    }

    public void receber(float saldo, String nome) {
        Cliente cliente = null;
        for (Cliente cli : clientes) {
            if (cli.getNome().equals(nome)) {
                Cliente client = cliente;
            }
        }
        if (cliente.saldo < saldo) {
            System.out.println("Fail:Pagamento maior que a propria divida!");
        }
        addTrasacao(saldo, clienteId);
        cliente.saldo -= saldo;
        this.saldo += saldo;
    }

    public ArrayList<Transacao> getHistorico() {
        return transacoes;
    }

    public void mostrarClient(String nome) {
        int c = searchCli(nome);
        if (c != -1) {
            Cliente cliente = clientes.get(searchCli(nome));
            System.out.println("Nome: " + cliente.getNome() + " | Saldo: " + cliente.getSaldo());
        } else {
            System.out.println("Cliente não existe!");
        }
    }

    public String toString() {
        String saida = "";
        for (Cliente cliente : clientes) {
            saida += cliente + "\n";
            saida += "saldo:" + this.saldo;
        }
        return saida;
    }
}