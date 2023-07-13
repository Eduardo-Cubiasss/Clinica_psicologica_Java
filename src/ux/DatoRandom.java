/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ux;
import Database.Contactos;
import java.util.Random;

/**
 *
 * @author 50369
 */
public class DatoRandom {
    private static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private Contactos ModelContactos;
    
    public DatoRandom(Contactos ModelContactos) {
        this.ModelContactos = ModelContactos;
    }
    
    public String DatoRandom (Contactos ModelContactos, int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
            char randomChar = ALLOWED_CHARACTERS.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        
        
        return stringBuilder.toString();
    }
}

