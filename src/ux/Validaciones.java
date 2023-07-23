/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


//donde dice implements KeyListener no debes crearlo para cada validación debido a que yo lo que 
//hice fue importar absolutamente todos los eventos pertenecientes a KeyListener
public class Validaciones implements KeyListener {

    //Con la linea de abajo estamos creando una variable que esta vacia, yo desde otras clases le daré valor a esa variable
    //para que interactue con los objetos 
    private JTextField textfieldenviado;
    //Con la linea de abajo se determina el nombre de la validacion debido a que el objeto KeyTyped tendrá muchos if y els
    // por lo que sugiero que uses switch case para que yo solo diga el nombre del case y se ejecute un proceso de if
    private String CasoValidacion;

    //El objeto public void keyTyped(KeyEvent) recibirá un textfield y una string (textofieldenviado y casoValdiacion)
    public Validaciones(JTextField textfieldenviado, String CasoValidacion) {
        //Con this es como actualizar una variable por así decirlo, de lo contrario estariamos usando una variable vacia en el procesp
        this.textfieldenviado = textfieldenviado;
        this.CasoValidacion = CasoValidacion;
        textfieldenviado.addKeyListener(this);
    }

    //Solo toca los case, no necesitas crear variables ni nada de eso, solo usa los case:)
    @Override
    public void keyTyped(KeyEvent e) {
        switch (CasoValidacion) {
            case "SoloNumeros":
                //Ese if verifica que en la cadena de texto solo existan números, de lo contrario no se leeran 
                if (!Character.isDigit(e.getKeyChar())) {

                    e.consume();
                    //e.consume(); se encarga de ejecutar los números, de lo contrario no permite escribir otro tipo de deato

                } else if (Character.isLetter(e.getKeyChar())) {
                    //Esto no da error pero no funciona:(
                    JOptionPane.showMessageDialog(null, "Se sugiere revisar la codificacion de errores", "Advertencia, J022GU", JOptionPane.INFORMATION_MESSAGE);

                }

                break;
            case "SoloLetras":
                //Aqui pondras el codigo para solo letras y así sucesivamente
                break;
        }
    }

    //Estos objetos de aqui abajo se generaron solos, si los deseas usar allí estan pero solo maneja el objeto de arriba
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Todo esto la verdad no funciona pero si te animas dale, no es necesario que lo hagas
        switch (CasoValidacion) {
            case "SoloNumeros":
                String texto = textfieldenviado.getText();
                boolean contieneLetras = texto.matches(".*[a-zA-Z].*");
                if (contieneLetras) {
                    JOptionPane.showMessageDialog(null, "Se sugiere revisar la codificación de errores", "Advertencia, J022GU", JOptionPane.INFORMATION_MESSAGE);
                    textfieldenviado.setText("");
                }
                break;
            case "SoloLetras":
                // Código para solo letras
                break;
        }

    }
}
