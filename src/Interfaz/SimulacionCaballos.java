/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Carrera;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class SimulacionCaballos extends javax.swing.JFrame {

    private JLabel caballox;
    
    public JLabel getCaballo1() {
        return Caballo1;
    }

    public void setCaballo1(JLabel Caballo1) {
        this.Caballo1 = Caballo1;
    }

    public JLabel getCaballo2() {
        return Caballo2;
    }

    public void setCaballo2(JLabel Caballo2) {
        this.Caballo2 = Caballo2;
    }

    public JLabel getCaballo10() {
        return Caballo10;
    }

    public void setCaballo10(JLabel Caballo10) {
        this.Caballo10 = Caballo10;
    }

    public JLabel getCaballo3() {
        return Caballo3;
    }

    public void setCaballo3(JLabel Caballo3) {
        this.Caballo3 = Caballo3;
    }

    public JLabel getCaballo4() {
        return Caballo4;
    }

    public void setCaballo4(JLabel Caballo4) {
        this.Caballo4 = Caballo4;
    }

    public JLabel getCaballo5() {
        return Caballo5;
    }

    public void setCaballo5(JLabel Caballo5) {
        this.Caballo5 = Caballo5;
    }

    public JLabel getCaballo6() {
        return Caballo6;
    }

    public void setCaballo6(JLabel Caballo6) {
        this.Caballo6 = Caballo6;
    }

    public JLabel getCaballo7() {
        return Caballo7;
    }

    public void setCaballo7(JLabel Caballo7) {
        this.Caballo7 = Caballo7;
    }

    public JLabel getCaballo8() {
        return Caballo8;
    }

    public void setCaballo8(JLabel Caballo8) {
        this.Caballo8 = Caballo8;
    }

    public JLabel getCaballo9() {
        return Caballo9;
    }

    public void setCaballo9(JLabel Caballo9) {
        this.Caballo9 = Caballo9;
    }

    public JLabel getMeta() {
        return Meta;
    }

    public void setMeta(JLabel Meta) {
        this.Meta = Meta;
    }

    public JPanel getPanel() {
        return Panel;
    }

    public void setPanel(JPanel Panel) {
        this.Panel = Panel;
    }

    public SimulacionCaballos() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Simulación Caballos");
        Panel.setBackground(Color.white);
        setResizable(true);
        setAlwaysOnTop(false);
        setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Caballo1 = new javax.swing.JLabel();
        Caballo2 = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        Caballo3 = new javax.swing.JLabel();
        Caballo4 = new javax.swing.JLabel();
        Caballo5 = new javax.swing.JLabel();
        Caballo6 = new javax.swing.JLabel();
        Caballo7 = new javax.swing.JLabel();
        Caballo8 = new javax.swing.JLabel();
        Caballo9 = new javax.swing.JLabel();
        Caballo10 = new javax.swing.JLabel();
        Meta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 102, 102));

        Caballo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Inicio.setText("Arrancar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Caballo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Caballo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        Meta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/meta.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caballo7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Caballo10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Caballo9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Caballo8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1098, 1098, 1098))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Caballo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Caballo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Caballo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Caballo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Caballo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Caballo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inicio)
                        .addGap(478, 478, 478)))
                .addComponent(Meta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Caballo1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caballo5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caballo10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Meta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Carrera c = new Carrera(caballox , this);
    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        Caballo1.setLocation(0, Caballo1.getLocation().y);
        Caballo2.setLocation(0, Caballo2.getLocation().y);
        c.arrancar();
        Inicio.setVisible(false);
    }//GEN-LAST:event_InicioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Caballo1;
    public javax.swing.JLabel Caballo10;
    public javax.swing.JLabel Caballo2;
    public javax.swing.JLabel Caballo3;
    public javax.swing.JLabel Caballo4;
    public javax.swing.JLabel Caballo5;
    public javax.swing.JLabel Caballo6;
    public javax.swing.JLabel Caballo7;
    public javax.swing.JLabel Caballo8;
    public javax.swing.JLabel Caballo9;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel Meta;
    public javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
