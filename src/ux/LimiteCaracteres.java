package ux;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;


public class LimiteCaracteres implements KeyListener {
    
    
    private final JTextField textField;
    private final int limiteCaracteres;

    public LimiteCaracteres(JTextField textField, int limiteCaracteres) {
        this.textField = textField;
        this.limiteCaracteres = limiteCaracteres;
        textField.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (textField.getText().length() >= limiteCaracteres) {
            e.consume(); // Ignorar el evento si se ha alcanzado el límite de caracteres
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No es necesario hacer nada aquí, pero debes mantener el método debido a la interfaz KeyListener
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No es necesario hacer nada aquí, pero debes mantener el método debido a la interfaz KeyListener
    }
    
}
