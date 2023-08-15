/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author 50369
 */
public class HabilitarPaneles {
    private HashMap<String, JPanel> paneles;

    public HabilitarPaneles() {
        paneles = new HashMap<>();
    }

    public void agregarPanel(String nombre, JPanel panel) {
        paneles.put(nombre, panel);
    }

    public void habilitarPanel(String nombrePanel) {
        JPanel panel = paneles.get(nombrePanel);
        if (panel != null) {
            panel.setEnabled(true);
        }
    }
    public void deshabilitarPanel(String nombrePanel) {
        JPanel panel = paneles.get(nombrePanel);
        if (panel != null) {
            panel.setEnabled(false);
        }
    }
}
