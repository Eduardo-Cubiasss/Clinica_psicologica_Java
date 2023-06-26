/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Ui.JF001_S1_AF;
import Ui.JF002_S1_RH;
import javax.swing.JFrame;

/**
 *
 * @author 50369
 */
public class Abrirvistas {
    public static void abrirJF001(){
        JFrame vista = new JF001_S1_AF();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Mostrar el JFrame
       vista.setVisible(true);
    }
    public static void abrirJF002(){
        JFrame vista = new JF002_S1_RH();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Mostrar el JFrame
       vista.setVisible(true);
    }
}
