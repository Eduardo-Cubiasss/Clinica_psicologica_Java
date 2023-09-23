/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ActividadesLaborales;
import Database.Empleado;
import Database.Procesos_almacenados;
import Ui.JP010_S2_AF;
import Ui.JP012_S2_AF;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BuscadorEmpleados implements ActionListener {

    private JPanel JPContenido;
    private JP012_S2_AF vista12;
    private Empleado modelEmpleado;
    private ActividadesLaborales modelactivity;
    private Resultado resultado;
    private Procesos_almacenados procesos;
    private DefaultTableModel tableModel;
    private HabilitarPaneles PanelesManager;
    private JP010_S2_AF vista10;

    public BuscadorEmpleados(JPanel JPContenido, JP012_S2_AF vista12, Empleado modelEmpleado, ActividadesLaborales modelactivity, Procesos_almacenados procesos, HabilitarPaneles PanelesManager, Resultado resultado, JP010_S2_AF vista10) {
        this.JPContenido = JPContenido;
        this.modelEmpleado = modelEmpleado;
        this.modelactivity = modelactivity;
        this.procesos = procesos;
        this.vista12 = vista12;
        this.vista10 = vista10;
        this.PanelesManager = PanelesManager;
        this.resultado = resultado;

        this.vista12.getBtn1_JF012().addActionListener(this);
        this.vista12.getBtn2_JF012().addActionListener(this);
        this.vista12.getBtn3_JF012().addActionListener(this);
        this.vista12.getBtnBuscar().addActionListener(this);

        String[] columnTitles = {"Id", "Nombres", "Actividad laboral"};

        tableModel = new DefaultTableModel(columnTitles, 0);
        vista12.getjTable1().setModel(tableModel);

        vista12.getjTable1().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = vista12.getjTable1().getSelectedRow();

                if (filaSeleccionada != -1) {
                    Object valorIDUsuario = vista12.getjTable1().getValueAt(filaSeleccionada, 0);

                    if (valorIDUsuario != null) {
                        int IDUsuario = Integer.parseInt(valorIDUsuario.toString());
                        modelEmpleado.setIdEmpleado(IDUsuario);
                        System.out.println(IDUsuario);
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista12.getBtn2_JF012()) {
            //tendria que ir el panelMBEliminarUsuario creoooo

            //Es para eliminar una cuenta
        } else if (e.getSource() == vista12.getBtn3_JF012()) {
            PanelesManager.copiaPanel("JP012_S2_AF");
            JPContenido.remove(vista12);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelPersonalClinica");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Es para volver al panel anterior
        } else if (e.getSource() == vista12.getBtn1_JF012()) {
            vista10.setTxtNombre(modelEmpleado.getNombre());
            vista10.setTxtEdad(String.valueOf(modelEmpleado.getEdad()));
            vista10.setTxtOficio(modelEmpleado.getActividadLab());
            vista10.setTxtDias(modelEmpleado.getDUI());

            // Actualiza la imagen en vista10 si hay una imagen en modelEmpleado
            if (modelEmpleado.getFotoPerfil() != null && modelEmpleado.getFotoPerfil().length > 0) {
                ImageIcon imagenIcon = new ImageIcon(modelEmpleado.getFotoPerfil());
                System.out.println("Entra aqui porque no esta vacia la imagen");

                // Obtener las dimensiones originales de la imagen
                int anchoOriginal = imagenIcon.getIconWidth();
                int altoOriginal = imagenIcon.getIconHeight();

                // Calcular el nuevo tamaño manteniendo la proporción
                int maxWidth = 200;
                int maxHeight = 250;
                int nuevoAncho = anchoOriginal;
                int nuevoAlto = altoOriginal;

                if (anchoOriginal > maxWidth || altoOriginal > maxHeight) {
                    double escalaAncho = (double) maxWidth / anchoOriginal;
                    double escalaAlto = (double) maxHeight / altoOriginal;
                    System.out.println("Reajusta las dimensiones");

                    // Escalar al tamaño más pequeño para mantener la proporción
                    double escala = Math.min(escalaAncho, escalaAlto);
                    nuevoAncho = (int) (anchoOriginal * escala);
                    nuevoAlto = (int) (altoOriginal * escala);
                }

                // Crear una nueva imagen redimensionada
                Image imagenRedimensionada = imagenIcon.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

                // Establecer la imagen redimensionada en el JLabel de vista10
                vista10.getLb_chino().setIcon(new ImageIcon(imagenRedimensionada));

                // Establecer las dimensiones del JLabel según la imagen redimensionada
                vista10.getLb_chino().setPreferredSize(new Dimension(nuevoAncho, nuevoAlto));

                // Asegúrate de que el JLabel se repinte
                vista10.getLb_chino().revalidate();
                vista10.getLb_chino().repaint();
            } else {
                // Si no hay imagen, puedes establecer un icono de imagen predeterminado o realizar otra acción adecuada
                vista10.getLb_chino().setIcon(null); // Esto quitará cualquier imagen existente en el JLabel
                vista10.getLb_chino().setPreferredSize(new Dimension(0, 0)); // Restablece las dimensiones del JLabel
                System.out.println("Esta vacio o contiene propiedades indebidas");
            }
            PanelesManager.copiaPanel("JP012_S2_AF");
            JPContenido.remove(vista12);
            ((CardLayout) JPContenido.getLayout()).show(JPContenido, "panelDetallesDePerfil");
            JPContenido.revalidate();
            JPContenido.repaint();
            PanelesManager.restaurarPanelEliminado();
            //Es para abrir el perfil del usuario en base a su ID
        } else if (e.getSource() == vista12.getBtnBuscar()) {
            String textoBusqueda = vista12.getjTextField1().getText();
            if (textoBusqueda != null && !textoBusqueda.isEmpty()) {
                System.out.println(textoBusqueda);
                actualizarTablaConResultadosDeBusqueda(textoBusqueda);

            } else {
                JOptionPane.showMessageDialog(null, "El JTextField de búsqueda esta vacío.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                // Puedes realizar otras acciones apropiadas aquí si es necesario
            }
            //Es para el buscador y que muestre los resultados en la tabla
        }

    }

    private void actualizarTablaConResultadosDeBusqueda(String textoBusqueda) {
        // Borra todas las filas existentes en el modelo
        tableModel.setRowCount(0);

        // Aquí debes realizar la consulta a la base de datos
        // y obtener los resultados que coincidan con el texto de búsqueda
        List<Resultado> resultados = procesos.Empleados(modelEmpleado, 1, textoBusqueda);

        for (Resultado resultado : resultados) {
            tableModel.addRow(new Object[]{resultado.getIdPaciente(), resultado.getNombre(), resultado.getApellido()});
        }
    }

}
