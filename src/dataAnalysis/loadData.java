
package dataAnalysis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;


public class loadData {
    public WaveformPanelContainer container;
    public void run(int i) throws UnsupportedAudioFileException, IOException {
                AudioInputStream audioInputStream = null;
                File file;
                file = new File("test"+(i+1)+".wav");
                System.out.println(file.toString());
                audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream (new FileInputStream (file)));
                container = new WaveformPanelContainer();
                container.setAudioToDisplay(audioInputStream);
    
}
}
