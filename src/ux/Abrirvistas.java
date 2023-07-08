package ux;

import javax.swing.JFrame;

public class Abrirvistas {
    private static JFrame ventanaActual; // Variable estática para almacenar la ventana actualmente abierta

    public static void abrir(String nombreClase) {
        try {
            if (ventanaActual != null) {
                ventanaActual.dispose(); // Cierra la ventana actual si existe
            }

            String nombreCompleto = "Ui." + nombreClase;
            Class<?> claseVista = Class.forName(nombreCompleto);
            ventanaActual = (JFrame) claseVista.getDeclaredConstructor().newInstance();

            ventanaActual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaActual.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
