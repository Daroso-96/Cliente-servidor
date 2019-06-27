package edu.cecar.logica;

import edu.CECAR.componentes.comunicaciones.SocketServidor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Servidor {

    private ArrayList<Carta> arrayListMazo = new ArrayList<>();
    private PaloDiamante paloDiamante = new PaloDiamante();
    private PaloLiz paloLiz = new PaloLiz();
    private PaloCorazon paloCorazon = new PaloCorazon();
    private PaloNegro paloNegro = new PaloNegro();
    private ArrayList<Carta> arrayListGenerico;
    int contador = 0;
    Carta carta;

    private SocketServidor servidor = new SocketServidor(7000);

    public Servidor() {
        try {
            Barajar();
            //Se reparten 3 cartas para e jugador
            for (int i = 0; i < 3; i++) {
                carta = DarCarta();
                servidor.getSalida().println(carta.getPinta());
                servidor.getSalida().println(carta.getPalo());
                servidor.getSalida().println(carta.getValor());
            }
            
            //Se reparten 3 cartas para el dealer
            for (int i = 0; i < 3; i++) {
                carta = DarCarta();
                servidor.getSalida().println(carta.getPinta());
                servidor.getSalida().println(carta.getPalo());
                servidor.getSalida().println(carta.getValor());
            }
            
            //El servidor se queda esperando solicitdes de entregar cartas
            while (true) {
                if (servidor.getEntrada().readLine().equals("DameCarta")) {
                    carta = DarCarta();
                    servidor.getSalida().println(carta.getPinta());
                    servidor.getSalida().println(carta.getPalo());
                    servidor.getSalida().println(carta.getValor());
                } else {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//Metodo que permite crear los palos y revolverlos
    public void Barajar() {
        arrayListGenerico = paloDiamante.getArrayListDiamantes();
        arrayListMazo.addAll(arrayListGenerico);
        arrayListMazo.addAll(arrayListGenerico);
        arrayListGenerico = paloCorazon.getArrayListCorazones();
        arrayListMazo.addAll(arrayListGenerico);
        arrayListMazo.addAll(arrayListGenerico);
        arrayListGenerico = paloLiz.getArrayListLiz();
        arrayListMazo.addAll(arrayListGenerico);
        arrayListMazo.addAll(arrayListGenerico);
        arrayListGenerico = paloNegro.getArrayLisNegro();
        arrayListMazo.addAll(arrayListGenerico);
        arrayListMazo.addAll(arrayListGenerico);
        Collections.shuffle(arrayListMazo);

    }

    //Metodo que retorna una carta del mazo
    public Carta DarCarta() {
        Carta resultado;
        if (contador < 104) {
            resultado = arrayListMazo.get(contador);
            contador++;
        } else {
            resultado = null;
        }
        return resultado;
    }

    public ArrayList<Carta> getArrayListMazo() {
        return arrayListMazo;
    }

    public void setArrayListMazo(ArrayList<Carta> arrayListMazo) {
        this.arrayListMazo = arrayListMazo;
    }

    public PaloDiamante getPaloDiamante() {
        return paloDiamante;
    }

    public void setPaloDiamante(PaloDiamante paloDiamante) {
        this.paloDiamante = paloDiamante;
    }

    public PaloLiz getPaloLiz() {
        return paloLiz;
    }

    public void setPaloLiz(PaloLiz paloLiz) {
        this.paloLiz = paloLiz;
    }

    public PaloCorazon getPaloCorazon() {
        return paloCorazon;
    }

    public void setPaloCorazon(PaloCorazon paloCorazon) {
        this.paloCorazon = paloCorazon;
    }

    public PaloNegro getPaloNegro() {
        return paloNegro;
    }

    public void setPaloNegro(PaloNegro paloNegro) {
        this.paloNegro = paloNegro;
    }

    public ArrayList<Carta> getArrayListGenerico() {
        return arrayListGenerico;
    }

    public void setArrayListGenerico(ArrayList<Carta> arrayListGenerico) {
        this.arrayListGenerico = arrayListGenerico;
    }

}
