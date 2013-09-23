
package recordingData;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;

public class Recorder {

    
     AudioFormat audioFormat;
     TargetDataLine targetDataLine;
     CaptureThread captureThread;
    public void captureAudio(int fileNumber) {
        
         audioFormat = getAudioFormat();
         DataLine.Info dataLineInfo =
                        new DataLine.Info(
                          TargetDataLine.class,
                          audioFormat);
        try {
            targetDataLine = (TargetDataLine)
                AudioSystem.getLine(dataLineInfo);
            
        } catch (Exception e) {
        }
        captureThread = new CaptureThread(audioFormat , targetDataLine, fileNumber);
    }
    
    public void threadRunner(Boolean isRunning) {
        
        if (isRunning == true){
          
          captureThread.start();
        }
        else {
          System.out.println("Stopping thread...");
          
          captureThread.targetDataLine2.stop();
          captureThread.targetDataLine2.drain();
          captureThread.targetDataLine2.flush();
          System.out.println("Thread Stopped");
        }
          
    }
    
    private AudioFormat getAudioFormat(){
        
    float sampleRate = 44100.0F;
    int sampleSizeInBits = 16;
    int channels = 1;
    boolean signed = true;
    boolean bigEndian = false;
    return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }
}
