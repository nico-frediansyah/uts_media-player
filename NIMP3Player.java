/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimusicplayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 62813
 */
public class NIMP3Player {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            FileInputStream fileInputStream = new FileInputStream("D://Majesty.mp3");
            Player player = new Player(fileInputStream);
            System.out.println("Lagu sedang diputar...");
            
            player.play();
        } catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(NIMP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
