package com.company;

public class Lapiseira {
    private String marca;
    private Grafite grafite;
    private boolean possuiGrafite;

    public Lapiseira(String marca, int tamanhoGrafite,double ponta ){
        this.marca = marca;
        this.grafite = new Grafite(ponta,tamanhoGrafite);
        this.possuiGrafite = false;
    }

    public void escrever(int gastarGrafite){
        if(this.grafite.getTamanhoGrafite()>0 && gastarGrafite < this.grafite.getTamanhoGrafite()) {
            this.grafite.gastaGrafite(gastarGrafite);

            //System.out.println("O tamanho do grafite e possivel  escrever!");
        }


    }
    public void colocarGrafite(){

    }
}
