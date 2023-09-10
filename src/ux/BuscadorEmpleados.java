/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import Database.ActividadesLaborales;
import Database.Empleado;
import Database.Procesos_almacenados;
import Ui.JP012_S2_AF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BuscadorEmpleados implements ActionListener{
    private JPanel JPContenido;
    private JP012_S2_AF vista12;
    private Empleado modelEmpleado;
    private ActividadesLaborales modelactivity;
    private Procesos_almacenados procesos;
    private DefaultTableModel tableModel;
    
    public BuscadorEmpleados(JPanel JPContenido, JP012_S2_AF vista12, Empleado modelEmpleado, ActividadesLaborales modelactivity, Procesos_almacenados procesos)
    {
        this.JPContenido = JPContenido;
        this.modelEmpleado = modelEmpleado;
        this.modelactivity = modelactivity;
        this.procesos = procesos;
        this.vista12 = vista12;
        
        this.vista12.getBtn1_JF012().addActionListener(this);
        this.vista12.getBtn2_JF012().addActionListener(this);
        this.vista12.getBtn3_JF012().addActionListener(this);
        
        String[] columnTitles = {"IdUsario", "Nombres", "Actividad laboral"};

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
        if(e.getSource() == vista12.getBtn2_JF012())
        {
            //Es para eliminar una cuenta
        }
        else if (e.getSource() == vista12.getBtn3_JF012())
        {
            //Es para volver al panel anterior
        }
        else if (e.getSource() == vista12.getBtn1_JF012())
        {
            //Es la lupita para buscar el empleado en base a su nombre
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
