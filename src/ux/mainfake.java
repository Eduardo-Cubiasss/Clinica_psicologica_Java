package ux;

import Ui.JF_000_S7_GU;
import Ui.SplashScreen;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class mainfake {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crea una instancia del JFrame JF_000_S7_GU
                JF_000_S7_GU vista = new JF_000_S7_GU();

                // Crea una instancia del SplashScreen y muestra antes que otros paneles
                SplashScreen splashScreen = new SplashScreen(vista.JPContenido);

                // Mostrar el panel que desees, por ejemplo:
                
                mostrarPanel("panelSplash", vista.JPContenido);

                // Hace la ventana JF_000_S7_GU visible
                vista.setVisible(true);
            }
        });
    }

    // Agregar este método para mostrar el panel deseado usando el CardLayout
    private static void mostrarPanel(String panelName, JPanel JPContenido) {
            
        CardLayout cardLayout = (CardLayout) JPContenido.getLayout();
        cardLayout.show(JPContenido, panelName);
    }
}
