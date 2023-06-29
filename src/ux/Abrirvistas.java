/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import javax.swing.JFrame;

/**
 *
 * @author 50369
 */
public class Abrirvistas {

    private static JFrame ventanaActual; // Variable estática para almacenar la ventana actualmente abierta

    public static void abrir(String nombreClase, JFrame ventanaAnterior) {
        try {
            if (ventanaAnterior != null) {
                ventanaAnterior.dispose(); // Cierra la ventana anterior si existe
            }

            String nombreCompleto = "Ui." + nombreClase;
            Class<?> claseVista = Class.forName(nombreCompleto);
            JFrame nuevaVentana = (JFrame) claseVista.getDeclaredConstructor().newInstance();

            nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            nuevaVentana.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
