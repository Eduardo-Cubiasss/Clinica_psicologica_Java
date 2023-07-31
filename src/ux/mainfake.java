/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JF_000_S7_GU;
import Ui.SplashScreen;
import java.awt.CardLayout;
import javax.swing.Timer;

/**
 *
 * @author 50369
 */
public class mainfake {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crea una instancia del JFrame JF_000_S7_GU
               JF_000_S7_GU vista = new JF_000_S7_GU();
               vista.setVisible(true);
            }
        });
    }
}
