/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimusicplayer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author 62813
 */
public class WavPlayer {
    
    private static AudioClip musik;
    
    public void mainMusik(String source) {
        URL urlku = this.getClass().getResource(source);
        musik = Applet.newAudioClip(urlku);
        musik.play();
    }
    
    public void stopMusik(String source) {
        URL urlku = this.getClass().getResource(source);
        musik = Applet.newAudioClip(urlku);
        musik.stop();
    }
    
    public static void main(String[] args) {
        WavPlayer sik = new WavPlayer();
        sik.mainMusik("VirtualParadise.wav");
    }
    
}
