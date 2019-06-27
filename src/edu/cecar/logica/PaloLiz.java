package edu.cecar.logica;

import java.util.ArrayList;

public final class PaloLiz {

    private ArrayList<Carta> arrayListLiz;
    private Carta carta;

    public PaloLiz() {
        arrayListLiz = new ArrayList<>();
        crearPalo();

    }

    public ArrayList<Carta> getArrayListLiz() {
        return arrayListLiz;
    }

    public void setArrayListLiz(ArrayList<Carta> arrayListLiz) {
        this.arrayListLiz = arrayListLiz;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public void crearPalo() {
        carta = new Carta("2", "Liz", 2);
        arrayListLiz.add(carta);
        carta = new Carta("3", "Liz", 3);
        arrayListLiz.add(carta);
        carta = new Carta("4", "Liz", 4);
        arrayListLiz.add(carta);
        carta = new Carta("5", "Liz", 5);
        arrayListLiz.add(carta);
        carta = new Carta("6", "Liz", 6);
        arrayListLiz.add(carta);
        carta = new Carta("7", "Liz", 7);
        arrayListLiz.add(carta);
        carta = new Carta("8", "Liz", 8);
        arrayListLiz.add(carta);
        carta = new Carta("9", "Liz", 9);
        arrayListLiz.add(carta);
        carta = new Carta("10", "Liz", 10);
        arrayListLiz.add(carta);
        carta = new Carta("J", "Liz", 10);
        arrayListLiz.add(carta);
        carta = new Carta("Q", "Liz", 10);
        arrayListLiz.add(carta);
        carta = new Carta("K", "Liz", 10);
        arrayListLiz.add(carta);
        carta = new Carta("A", "Liz", 11);
        arrayListLiz.add(carta);

    }

}
