package edu.cecar.presentacion;

import edu.CECAR.componentes.comunicaciones.SocketCliente;
import edu.cecar.logica.Carta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class GuiJuego extends javax.swing.JFrame {

    ArrayList<Carta> arrayListManoJugador;
    ArrayList<Carta> arrayListManoDealer;
    private SocketCliente cliente;
    Carta carta;
    int puntajeJugador;
    int puntajeDealer;
    String pinta;
    String palo;
    int valor;

    public GuiJuego() {
        initComponents();
        this.setVisible(true);
       //Se crea la conexion con el servidor
        cliente = new SocketCliente("127.0.0.1", 7000);
      
        arrayListManoJugador = new ArrayList<>();
        arrayListManoDealer = new ArrayList<>();
        //Se solicitan las cartas iniciales para jugador y dealer
        reparteCartasInicialesJugador();
        reparteCartasInicialesDealer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonPedirCarta = new javax.swing.JButton();
        jButtonPlantar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTPuntajeJugador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaJugador = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTPuntajeDealer = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDealer = new javax.swing.JTextArea();
        jTGanador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Nuevo juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPedirCarta.setText("Pedir carta");
        jButtonPedirCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedirCartaActionPerformed(evt);
            }
        });

        jButtonPlantar.setText("Plantar");
        jButtonPlantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlantarActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntaje del jugador: ");

        jTextAreaJugador.setColumns(20);
        jTextAreaJugador.setRows(5);
        jScrollPane1.setViewportView(jTextAreaJugador);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTPuntajeJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPedirCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPlantar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPuntajeJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPedirCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlantar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Puntaje del dealer:");

        jTextAreaDealer.setColumns(20);
        jTextAreaDealer.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDealer);

        jTGanador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPuntajeDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPuntajeDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 281, -1, 290));

        setSize(new java.awt.Dimension(767, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPlantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlantarActionPerformed
        //Si el jugador se planta, se inabilita su botos y juega el dealaer
        jButtonPedirCarta.setEnabled(false);
        jugadaDealer();
    }//GEN-LAST:event_jButtonPlantarActionPerformed

    private void jButtonPedirCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedirCartaActionPerformed
        //Se pide una carta al servidor
        try {
            cliente.getSalida().println("DameCarta");
            pinta = cliente.getEntrada().readLine();
            palo = cliente.getEntrada().readLine();
            valor = Integer.parseInt(cliente.getEntrada().readLine());
            carta = new Carta(pinta, palo, valor);
            arrayListManoJugador.add(carta);
            jTextAreaJugador.setText(null);
            for (int i = 0; i < arrayListManoJugador.size(); i++) {
                jTextAreaJugador.append(arrayListManoJugador.get(i).getPinta() + " - " + arrayListManoJugador.get(i).getPalo() + "\n");

            }
            mostrarPuntajeJugador();
            if (puntajeJugador >= 31) {
                jButtonPedirCarta.setEnabled(false);

                jugadaDealer();

            }
        } catch (IOException ex) {
            Logger.getLogger(GuiJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPedirCartaActionPerformed

    public void reparteCartasInicialesJugador() {
        //El jugador Solicita tres cartas al servidor
        for (int i = 0; i < 3; i++) {
            try {
                pinta = cliente.getEntrada().readLine();
                palo = cliente.getEntrada().readLine();
                valor = Integer.parseInt(cliente.getEntrada().readLine());
                carta = new Carta(pinta, palo, valor);
                arrayListManoJugador.add(carta);
            } catch (IOException ex) {
                Logger.getLogger(GuiJuego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        for (int i = 0; i < arrayListManoJugador.size(); i++) {
            jTextAreaJugador.append(arrayListManoJugador.get(i).getPinta() + " - " + arrayListManoJugador.get(i).getPalo() + "\n");

        }
        mostrarPuntajeJugador();
        if (puntajeJugador == 31) {
            jButtonPedirCarta.setEnabled(false);

        }

    }

    public void reparteCartasInicialesDealer() {
  //El Dealer Solicita tres cartas al servidor
        for (int i = 0; i < 3; i++) {
            try {
                pinta = cliente.getEntrada().readLine();
                palo = cliente.getEntrada().readLine();
                valor = Integer.parseInt(cliente.getEntrada().readLine());
                carta = new Carta(pinta, palo, valor);
                arrayListManoDealer.add(carta);
            } catch (IOException ex) {
                Logger.getLogger(GuiJuego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        for (int i = 0; i < arrayListManoDealer.size(); i++) {
            jTextAreaDealer.append(arrayListManoDealer.get(i).getPinta() + " - " + arrayListManoDealer.get(i).getPalo() + "\n");

        }
        mostrarPuntajeDealer();

        if (puntajeDealer == 31) {
            cliente.getSalida().println("null");
            verificarGanador();
        }
        if (puntajeJugador == 31 && puntajeDealer < 27) {
            jugadaDealer();
        }
        if (puntajeJugador == 31 && puntajeDealer >= 27) {
            cliente.getSalida().println("null");
            verificarGanador();
        }

    }

    //Metodo que calcula y muestra el puntaje del jugador
    public void mostrarPuntajeJugador() {
        puntajeJugador = 0;
        for (int i = 0; i < arrayListManoJugador.size(); i++) {
            puntajeJugador = puntajeJugador + arrayListManoJugador.get(i).getValor();
        }
        jTPuntajeJugador.setText(String.valueOf(puntajeJugador));
    }
  //Metodo que calcula y muestra el puntaje del dealer
    public void mostrarPuntajeDealer() {
        puntajeDealer = 0;
        for (int i = 0; i < arrayListManoDealer.size(); i++) {
            puntajeDealer = puntajeDealer + arrayListManoDealer.get(i).getValor();
        }
        jTPuntajeDealer.setText(String.valueOf(puntajeDealer));
    }

    public void jugadaDealer() {
//Ciclo infinito, en el que el dealer pedira cartas hasta que su mano sea mayor o igual a 27
        while (true) {
            try {
                if (puntajeDealer >= 27) {
                    cliente.getSalida().println("null");
                    break;
                }

                cliente.getSalida().println("DameCarta");
                pinta = cliente.getEntrada().readLine();
                palo = cliente.getEntrada().readLine();
                valor = Integer.parseInt(cliente.getEntrada().readLine());
                carta = new Carta(pinta, palo, valor);
                arrayListManoDealer.add(carta);
                jTextAreaDealer.setText(null);
                for (int i = 0; i < arrayListManoDealer.size(); i++) {
                    jTextAreaDealer.append(arrayListManoDealer.get(i).getPinta() + " - " + arrayListManoDealer.get(i).getPalo() + "\n");

                }
                mostrarPuntajeDealer();
                if (puntajeDealer >= 27) {
                    cliente.getSalida().println("null");
                    break;
                }
            } catch (IOException ex) {
                Logger.getLogger(GuiJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Cuando el dealer termina su juego, se verifica el ganador
        verificarGanador();
    }

    //Seria de combinaciones posibles para determinar el ganador
    public void verificarGanador() {
        if (puntajeJugador <= 31 && puntajeJugador > puntajeDealer) {
            jTGanador.setText("Jugador Gana :)");
        }
        if (puntajeDealer <= 31 && puntajeDealer > puntajeJugador) {
            jTGanador.setText("Dealer Gana :)");
        }

        if (puntajeJugador > 31 && puntajeDealer <= 31) {
            jTGanador.setText("Dealer Gana :)");
        }
        if (puntajeDealer > 31 && puntajeJugador <= 31) {
            jTGanador.setText("Jugador Gana :)");
        }
        if (puntajeJugador > 31 && puntajeDealer > 31) {
            jTGanador.setText("Dealer Gana :)");
        }
        if (puntajeJugador <= 31 && puntajeDealer <= 31 && puntajeJugador == puntajeDealer) {
            jTGanador.setText("Empate .-.");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPedirCarta;
    private javax.swing.JButton jButtonPlantar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTGanador;
    private javax.swing.JTextField jTPuntajeDealer;
    private javax.swing.JTextField jTPuntajeJugador;
    private javax.swing.JTextArea jTextAreaDealer;
    private javax.swing.JTextArea jTextAreaJugador;
    // End of variables declaration//GEN-END:variables
}
