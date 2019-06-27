package edu.cecar.logica;

import java.util.ArrayList;

public final class PaloDiamante {

    private ArrayList<Carta> arrayListDiamantes;
    private Carta carta;

    public PaloDiamante() {
        arrayListDiamantes = new ArrayList<>();
        crearPalo();

    }

    public void crearPalo() {
        carta = new Carta("2", "Diamante", 2);
        arrayListDiamantes.add(carta);
        carta = new Carta("3", "Diamante", 3);
        arrayListDiamantes.add(carta);
        carta = new Carta("4", "Diamante", 4);
        arrayListDiamantes.add(carta);
        carta = new Carta("5", "Diamante", 5);
        arrayListDiamantes.add(carta);
        carta = new Carta("6", "Diamante", 6);
        arrayListDiamantes.add(carta);
        carta = new Carta("7", "Diamante", 7);
        arrayListDiamantes.add(carta);
        carta = new Carta("8", "Diamante", 8);
        arrayListDiamantes.add(carta);
        carta = new Carta("9", "Diamante", 9);
        arrayListDiamantes.add(carta);
        carta = new Carta("10", "Diamante", 10);
        arrayListDiamantes.add(carta);
        carta = new Carta("J", "Diamante", 10);
        arrayListDiamantes.add(carta);
        carta = new Carta("Q", "Diamante", 10);
        arrayListDiamantes.add(carta);
        carta = new Carta("K", "Diamante", 10);
        arrayListDiamantes.add(carta);
        carta = new Carta("A", "Diamante", 11);
        arrayListDiamantes.add(carta);

    }

    public ArrayList<Carta> getArrayListDiamantes() {
        return arrayListDiamantes;
    }

    public void setArrayListDiamantes(ArrayList<Carta> arrayListDiamantes) {
        this.arrayListDiamantes = arrayListDiamantes;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

}
