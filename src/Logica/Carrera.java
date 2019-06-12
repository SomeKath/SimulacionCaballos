/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.SimulacionCaballos;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Carrera extends Thread {

    private JLabel eti;
    private SimulacionCaballos p;

    public Carrera(JLabel eti, SimulacionCaballos p) {
        this.eti = eti;
        this.p = p;
    }
    public void arrancar (){
        Carrera hilo1 = new Carrera(p.Caballo1, p);
        Carrera hilo2 = new Carrera(p.Caballo2, p);
        Carrera hilo3 = new Carrera(p.Caballo3, p);
        Carrera hilo4 = new Carrera(p.Caballo4, p);
        Carrera hilo5 = new Carrera(p.Caballo5, p);
        Carrera hilo6 = new Carrera(p.Caballo6, p);
        Carrera hilo7 = new Carrera(p.Caballo7, p);
        Carrera hilo8 = new Carrera(p.Caballo8, p);
        Carrera hilo9 = new Carrera(p.Caballo9, p);
        Carrera hilo10 = new Carrera(p.Caballo10, p);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();
    }
    public void run() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, i = 1;
        while (true) {
            try {
                sleep((int) (Math.random() * 250));
                c1 = p.getCaballo1().getLocation().x;
                c2 = p.getCaballo2().getLocation().x;
                c3 = p.getCaballo3().getLocation().x;
                c4 = p.getCaballo4().getLocation().x;
                c5 = p.getCaballo5().getLocation().x;
                c6 = p.getCaballo6().getLocation().x;
                c7 = p.getCaballo7().getLocation().x;
                c8 = p.getCaballo8().getLocation().x;
                c9 = p.getCaballo9().getLocation().x;
                c10 = p.getCaballo10().getLocation().x;

                if (c1 < p.getMeta().getLocation().x - 10 && c2 < p.getMeta().getLocation().x - 10
                        && c3 < p.getMeta().getLocation().x - 10 && c4 < p.getMeta().getLocation().x - 10
                        && c5 < p.getMeta().getLocation().x - 10 && c6 < p.getMeta().getLocation().x - 10
                        && c7 < p.getMeta().getLocation().x - 10 && c8 < p.getMeta().getLocation().x - 10
                        && c9 < p.getMeta().getLocation().x - 10 && c10 < p.getMeta().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + 20, eti.getLocation().y);

                    p.Caballo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));
                    p.Caballo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/" + i + ".png")));

                    p.repaint();
                    if (i <= 11) {
                        i++;
                    } else {
                        i = 1;
                    }
                } else {
                    break;
                }
            } catch (InterruptedException e) {

            }
            if (eti.getLocation().x >= p.getMeta().getLocation().x - 10) {
                if (c1 > c2 && c1 > c3 && c1 > c4 && c1 > c5 && c1 > c6 && c1 > c7 && c1 > c8 && c1 > c9 && c1 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 1");
                } else if (c2 > c1 && c2 > c3 && c2 > c4 && c2 > c5 && c2 > c6 && c2 > c7 && c2 > c8 && c2 > c9 && c2 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 2");
                } else if (c3 > c1 && c3 > c2 && c3 > c4 && c3 > c5 && c3 > c6 && c3 > c7 && c3 > c8 && c3 > c9 && c3 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 3");
                } else if (c4 > c1 && c4 > c2 && c4 > c3 && c4 > c5 && c4 > c6 && c4 > c7 && c4 > c8 && c4 > c9 && c4 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 4");
                } else if (c5 > c1 && c5 > c2 && c5 > c3 && c5 > c4 && c5 > c6 && c5 > c7 && c5 > c8 && c5 > c9 && c5 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 5");
                } else if (c6 > c1 && c6 > c2 && c6 > c3 && c6 > c4 && c6 > c5 && c6 > c7 && c6 > c8 && c6 > c9 && c6 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 6");
                } else if (c7 > c1 && c7 > c2 && c7 > c3 && c7 > c4 && c7 > c5 && c7 > c6 && c7 > c8 && c7 > c9 && c7 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 7");
                } else if (c8 > c1 && c8 > c2 && c8 > c3 && c8 > c4 && c8 > c5 && c8 > c6 && c8 > c7 && c8 > c9 && c8 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 8");
                } else if (c9 > c1 && c9 > c2 && c9 > c3 && c9 > c4 && c9 > c5 && c9 > c6 && c9 > c7 && c9 > c8 && c9 > c10) {
                    JOptionPane.showMessageDialog(null, "Ganó 9");
                } else if (c10 > c1 && c10 > c2 && c10 > c3 && c10 > c4 && c10 > c5 && c10 > c6 && c10 > c7 && c10 > c8 && c10 > c9) {
                    JOptionPane.showMessageDialog(null, "Ganó 10");
                } else {
                    JOptionPane.showMessageDialog(null, "Empate.");
                }
            }
        }
    }
}
