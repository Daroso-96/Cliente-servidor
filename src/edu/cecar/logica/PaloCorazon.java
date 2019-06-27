package edu.cecar.logica;

import java.util.ArrayList;

public final class PaloCorazon {

   private ArrayList<Carta> arrayListCorazones;
    private Carta carta;

    public PaloCorazon() {
        arrayListCorazones = new ArrayList<>();
        crearPalo();
        
    }

    public ArrayList<Carta> getArrayListCorazones() {
        return arrayListCorazones;
    }

    public void setArrayListCorazones(ArrayList<Carta> arrayListCorazones) {
        this.arrayListCorazones = arrayListCorazones;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    
    
 public void crearPalo() {
        carta = new Carta("2", "Corazon", 2);
        arrayListCorazones.add(carta);
        carta = new Carta("3", "Corazon", 3);
        arrayListCorazones.add(carta);
        carta = new Carta("4", "Corazon", 4);
        arrayListCorazones.add(carta);
        carta = new Carta("5", "Corazon", 5);
        arrayListCorazones.add(carta);
        carta = new Carta("6", "Corazon", 6);
        arrayListCorazones.add(carta);
        carta = new Carta("7", "Corazon", 7);
        arrayListCorazones.add(carta);
        carta = new Carta("8", "Corazon", 8);
        arrayListCorazones.add(carta);
        carta = new Carta("9", "Corazon", 9);
        arrayListCorazones.add(carta);
        carta = new Carta("10", "Corazon", 10);
        arrayListCorazones.add(carta);
        carta = new Carta("J", "Corazon", 10);
        arrayListCorazones.add(carta);
        carta = new Carta("Q", "Corazon", 10);
        arrayListCorazones.add(carta);
        carta = new Carta("K", "Corazon", 10);
        arrayListCorazones.add(carta);
        carta = new Carta("A", "Corazon", 11);
        arrayListCorazones.add(carta);

    }

        
        
}
