package ux;
import Ui.JF_000_S7_GU;
import javax.swing.UIManager;


public class ColorBotones {
 public void jButton2MouseExited() {
        JF_000_S7_GU formulario = new JF_000_S7_GU();             
        formulario.jButton2.setBackground(UIManager.getColor("control"));
 } 
      
        
   public void jButton2MouseEntered() {
      
        JF_000_S7_GU formulario = new JF_000_S7_GU();               
        formulario.jButton2.setBackground(UIManager.getColor("activeCaption"));
   }
}


   
    




