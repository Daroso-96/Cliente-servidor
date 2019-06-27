package edu.cecar.logica;

public class Carta {
    
private String pinta;
private String palo;
private int valor;

    public Carta(String pinta, String palo, int valor) {
        this.pinta = pinta;
        this.palo = palo;
        this.valor = valor;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    
}
