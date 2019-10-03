package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Topique {
    ArrayList <Pass> cadeiras;
    int qtdpref;
    int lotacaoMax;



    public Topique(int qtdpref, int lotacaoMax){
        this.qtdpref = qtdpref;
        cadeiras = new ArrayList<Pass>();
        for (int i = 0;i < lotacaoMax;i++){
            cadeiras.add(null);
            this.lotacaoMax = lotacaoMax;
        }
    }

    public String show (){
        String retorno = "[";
        for(int i = 0;i<lotacaoMax;i++){
            if(i < qtdpref){
                retorno +=" @";
            } else
                retorno+= " =";
            if (cadeiras.get(i)!= null){
                retorno +=cadeiras.get(i);
            }
        }
            return retorno+"]";
    }
    public void Inserir(int id ,int idade,String nome ){
        if(idade>=60){
            int cadeira = get_cadeira(1);
            if(cadeira == -1){
                System.out.println("Falha, topique cheia.\n");
            }else{
                cadeiras.set(cadeira,new Pass(id, nome, idade));
                System.out.println("Inserido na topique com sucesso. \n");
            }
        }else{
            int cadeira = get_cadeira(0);
            if(cadeira == -1) {
                System.out.println("Falha, topique cheia.\n");
            }else{
                cadeiras.set(cadeira,new Pass(id, nome, idade));
                System.out.println("Inserido na topique com sucesso. \n");
            }
        }
    }

    public int get_cadeira(int id){
        if(id == 1) {
            for (int i = 0; i < lotacaoMax; i++) {
                if (cadeiras.get(i) == null) {
                    return i;
                }
            }
            return -1;
        }else{
            for (int i = qtdpref; i < lotacaoMax; i++) {
                if (cadeiras.get(i) == null) {
                    return i;
                }
            }
            for (int i = 0; i < qtdpref; i++) {
                if (cadeiras.get(i) == null) {
                    return i;
                }
            }
            return -1;
        }
    }
    public boolean remover(int id){
        for(int i= 0;i<cadeiras.size();i++){
            if(cadeiras.get(i)!= null){
                if(Objects.equals(cadeiras.get(i).id, id))
                    cadeiras.set(i,null);
                    return true;

            }
        }

        return false;
    }
}
