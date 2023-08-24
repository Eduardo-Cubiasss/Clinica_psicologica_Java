package ux;

import Ui.JF_000_S7_GU;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HabilitarPaneles {

    private HashMap<String, JPanel> paneles;
    private JF_000_S7_GU vista;

    private String nombreUltimoPanelEliminado; // Variable para almacenar el nombre del último panel eliminado

    public HabilitarPaneles() {
        this.paneles = new HashMap<>();
        this.nombreUltimoPanelEliminado = null; // Inicialmente no hay ningún panel eliminado
    }

    public void agregarPanel(String nombre, JPanel panel) {
        paneles.put(nombre, panel);
    }

    public JPanel obtenerPanel(String nombrePanel) {
        return paneles.get(nombrePanel);
    }

    public JPanel copiaPanel(String nombrePanel) {
        JPanel panelOriginal = paneles.get(nombrePanel);
        if (panelOriginal != null) {
            // Crea una copia del panel original
            JPanel copiaPanel = new JPanel();
            copiaPanel.setLayout(new CardLayout()); // Configura el layout según tus necesidades

            // Clona los componentes del panel original al panel de copia
            Component[] componentes = panelOriginal.getComponents();
            for (Component componente : componentes) {
                copiaPanel.add(componente);
            }
           nombreUltimoPanelEliminado = nombrePanel;
            return copiaPanel;
        }
        return null; // Si no se encuentra el panel original, devuelve null
    }

    public JPanel obtenerPanelCopia(String nombrePanel) {
        return copiaPanel(nombrePanel); // Obtiene una copia del panel
    }

    public void mostrarPanel(String nombrePanel) {
        JPanel panel = obtenerPanel(nombrePanel);
        if (panel != null) {
            panel.setVisible(true);
        }
    }

    public void ocultarPanel(String nombrePanel) {
        JPanel panel = obtenerPanel(nombrePanel);
        if (panel != null) {
            panel.setVisible(false);
        }
    }


    public void restaurarPanelEliminado(JF_000_S7_GU vista) {
        if (nombreUltimoPanelEliminado != null) {
            // Restaura el panel original usando el nombre almacenado
            JPanel copia = obtenerPanelCopia(nombreUltimoPanelEliminado);
            JPanel panelOriginal = obtenerPanel(nombreUltimoPanelEliminado);
            if (panelOriginal != null && copia != null) {
                panelOriginal.removeAll();
                Component[] componentesCopia = copia.getComponents();
                for (Component componente : componentesCopia) {
                    panelOriginal.add(componente);
                }
                vista.JPContenido.add(panelOriginal); // Agrega el panel anterior
                vista.JPContenido.revalidate();
                vista.JPContenido.repaint();
            }
        }
    }
}
