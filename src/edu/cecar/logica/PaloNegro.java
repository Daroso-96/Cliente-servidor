package edu.cecar.logica;

import java.util.ArrayList;

public final class PaloNegro {
    private ArrayList<Carta> arrayLisNegro;
    private Carta carta;

    public PaloNegro() {
        arrayLisNegro = new ArrayList<>();
        crearPalo();
    }

    public ArrayList<Carta> getArrayLisNegro() {
        return arrayLisNegro;
    }

    public void setArrayLisNegro(ArrayList<Carta> arrayLisNegro) {
        this.arrayLisNegro = arrayLisNegro;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    
    
    
    
        public void crearPalo() {
        carta = new Carta("2", "Negro", 2);
        arrayLisNegro.add(carta);
        carta = new Carta("3", "Negro", 3);
        arrayLisNegro.add(carta);
        carta = new Carta("4", "Negro", 4);
        arrayLisNegro.add(carta);
        carta = new Carta("5", "Negro", 5);
        arrayLisNegro.add(carta);
        carta = new Carta("6", "Negro", 6);
        arrayLisNegro.add(carta);
        carta = new Carta("7", "Negro", 7);
        arrayLisNegro.add(carta);
        carta = new Carta("8", "Negro", 8);
        arrayLisNegro.add(carta);
        carta = new Carta("9", "Negro", 9);
        arrayLisNegro.add(carta);
        carta = new Carta("10", "Negro", 10);
        arrayLisNegro.add(carta);
        carta = new Carta("J", "Negro", 10);
        arrayLisNegro.add(carta);
        carta = new Carta("Q", "Negro", 10);
        arrayLisNegro.add(carta);
        carta = new Carta("K", "Negro", 10);
        arrayLisNegro.add(carta);
        carta = new Carta("A", "Negro", 11);
        arrayLisNegro.add(carta);

    }


    
}
