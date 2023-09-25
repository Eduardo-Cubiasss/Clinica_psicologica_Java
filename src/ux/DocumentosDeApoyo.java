/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.Articulos;
import Database.Procesos_almacenados;
import Ui.JP027_S3_RH;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class DocumentosDeApoyo implements ActionListener {

    private JPanel JPContenido;
    private HabilitarPaneles PanelesManager;
    private JP027_S3_RH panel;
    private Procesos_almacenados procesos;
    private Articulos Docs;

    private Icon createCircleIcon(int size, Color color) {
        return new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(color);
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.fillOval(x, y, size, size);
                g2d.dispose();
            }

            @Override
            public int getIconWidth() {
                return size;
            }

            @Override
            public int getIconHeight() {
                return size;
            }
        };
    }

    private ImageIcon createResizedImageIcon(byte[] imageData, int maxSize) throws IOException {
        BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(imageData));

        int originalWidth = originalImage.getWidth();
        int originalHeight = originalImage.getHeight();

        int newWidth, newHeight;

        // Calcular las nuevas dimensiones manteniendo la relación de aspecto
        if (originalWidth > originalHeight) {
            // Si el ancho es mayor que la altura
            if (originalWidth > maxSize) {
                double scale = (double) maxSize / originalWidth;
                newWidth = maxSize;
                newHeight = (int) (originalHeight * scale);
            } else {
                newWidth = originalWidth;
                newHeight = originalHeight;
            }
        } else {
            // Si la altura es mayor que el ancho
            if (originalHeight > maxSize) {
                double scale = (double) maxSize / originalHeight;
                newHeight = maxSize;
                newWidth = (int) (originalWidth * scale);
            } else {
                newWidth = originalWidth;
                newHeight = originalHeight;
            }
        }

        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
        g.dispose();

        return new ImageIcon(resizedImage);
    }

    public DocumentosDeApoyo(JPanel JPContenido, HabilitarPaneles PanelesManager, JP027_S3_RH panel, Procesos_almacenados procesos,
            Articulos Docs) {
        this.JPContenido = JPContenido;
        this.PanelesManager = PanelesManager;
        this.panel = panel;
        this.Docs = Docs;
        this.procesos = procesos;

        this.panel.Btn001_JF027_S3_RH.addActionListener(this);
        this.panel.Btn02_JF027_S3_RH.addActionListener(this);
        this.panel.Btn03_JF027_S3_RH.addActionListener(this);
        this.panel.ContenedordeDocs.setLayout(new GridLayout(1, 0, 10, 0));

    }

    public void generarPanelesDeDocumentos(int IDArticulo, String titulo, byte[] imagen) {
        JPanel panelDocumento = new JPanel(); // Crea un nuevo panel para cada documento
        panelDocumento.setLayout(new FlowLayout(FlowLayout.LEFT)); // FlowLayout izquierda sin espacio

        // Crea un JCheckBox personalizado con un ícono de círculo
        JCheckBox checkBox = new JCheckBox();
        checkBox.setIcon(createCircleIcon(20, Color.BLACK)); // Cambia el tamaño y el color del círculo según tus necesidades
        checkBox.setSelectedIcon(createCircleIcon(20, Color.RED)); // Ícono cuando está seleccionado
        checkBox.setBorderPaintedFlat(true); // Quita el borde de la casilla de verificación
        panelDocumento.add(checkBox);

        JLabel lblTitulo = new JLabel(titulo);
        panelDocumento.add(lblTitulo);

        // Crea y muestra la imagen si está disponible
        if (imagen != null && imagen.length > 0) {
            try {
                // Redimensionar la imagen antes de agregarla al panelDocumento
                ImageIcon resizedIcon = createResizedImageIcon(imagen, 361); // Cambiar 361 por la altura deseada
                JLabel lblImagen = new JLabel(resizedIcon);
                panelDocumento.add(lblImagen);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // Asignar un escuchador de eventos al CheckBox para imprimir el IDArticulo
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    // La casilla de verificación está seleccionada
                    // Puedes realizar acciones con el IDArticulo aquí
                    System.out.println("Este es el IDArticulo que disque esta vacio " + IDArticulo);
                    Docs.setIDArticulo(IDArticulo);

                } else {
                    // La casilla de verificación está deseleccionada
                }
            }
        });

        this.panel.ContenedordeDocs.add(panelDocumento); // Agrega el panel al contenedor
        this.panel.ContenedordeDocs.revalidate(); // Actualiza la disposición
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.getBtn001_JF027_S3_RH()) {
            PanelesManager.copiaPanel("JP027_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelMenuTp");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Botón para volver un panel anterior (menú)
        } else if (e.getSource() == panel.getBtn02_JF027_S3_RH()) {
            PanelesManager.copiaPanel("JP027_S3_RH");
            JPContenido.remove(panel);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelAgregarArticulo");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();

            //Botón Agregar documento de apoyo
        } else if (e.getSource() == panel.getBtn03_JF027_S3_RH()) {
            panel.ContenedordeDocs.removeAll(); // Esto eliminará todos los componentes dentro del panel
            panel.ContenedordeDocs.revalidate(); // Actualiza el diseño del panel
            panel.ContenedordeDocs.repaint(); // Repinta el panel si es necesario
            procesos.BorrarArticulo(Docs);
            procesos.GenerarDocumentos(Docs, this);
            // Botón eliminar documento de 
        }

    }

}
