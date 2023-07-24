/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JF_000_S7_GU;

/**
 *
 * @author 50369
 */
public class mainfake {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crea una instancia del JFrame JF_000_S7_GY
                JF_000_S7_GU jFrame = new JF_000_S7_GU();

                // Haz visible el JFrame
                jFrame.setVisible(true);
            }
        });
    }
}

