
package recordingData;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


class CaptureThread extends Thread{

    public Recorder recorder = new Recorder();
    public AudioFormat audioFormat2 = null;
    public TargetDataLine targetDataLine2 = null;
    public int fileNumber2 = 0;
    
    CaptureThread(AudioFormat audioFormat, TargetDataLine targetDataLine, int fileNumber) {
        
        audioFormat2 = audioFormat;
        targetDataLine2 = targetDataLine;
        fileNumber2 = fileNumber;
       System.out.println("Capture Thread " + targetDataLine2);
    }
    
    @Override
   public void run(){
        
            AudioFileFormat.Type fileType = null;
            
            String fileName = "sound"+ fileNumber2 + ".wav";
            
            File audioFile = null;
            
            fileType = AudioFileFormat.Type.WAVE;
            audioFile = new File(fileName);
          
            System.out.println(audioFormat2.getSampleRate());
            System.out.println(audioFormat2.getSampleSizeInBits());
            System.out.println(audioFormat2.getChannels());
            System.out.println("run " + targetDataLine2);
        try {
            targetDataLine2.open(audioFormat2);
        } catch (Exception e) { 
        }
            targetDataLine2.start();      
            
        try {
            AudioSystem.write(
                         new AudioInputStream(targetDataLine2),
                         fileType,
                         audioFile);
            System.out.println(new AudioInputStream(targetDataLine2).getFrameLength());
    
        } catch (IOException e) {
            System.out.println("I/O Exception Occured");
        }

  }
    
}
