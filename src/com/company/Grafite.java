package com.company;

public class Grafite {
    double ponta;
    int tamanhoGrafite;

    public Grafite(double ponta , int tamanhoGrafite){
        this.ponta = ponta;
        this.tamanhoGrafite = tamanhoGrafite;
    }

    public void gastaGrafite(int gastado){
        if(tamanhoGrafite!=0 ){
            if(gastado>tamanhoGrafite){
                System.out.println("Fail: Grafite só possui "+tamanhoGrafite+" de tamanho");
            }else{
                this.tamanhoGrafite -=gastado;
                System.out.println("Grafite gastado!");
            }
        }else{
            System.out.println("Fail: O grafite já acabou!");
        }
    }
    public int getTamanhoGrafite(){
        return tamanhoGrafite;
    }


}
