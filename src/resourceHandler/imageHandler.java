
package resourceHandler;

/**
 * @author Lucas Zeer-Wanklyn
 */
public class imageHandler {
    
    public String[] imagePath = new String[4];
    
    
    public int ChangePictureForward(int x) {
    x+=1;
        if (x >3) {
            x = 0;
        }

    return x;
    }
    
    public int ChangePictureBackward(int x) {
    x-=1;
    if (x < 0) {
      x = 3;
    }
    
    return x;
    
    }
    public void ImageLoad(){
    int imageCount = 4;
       for (int i = 1; i <= imageCount; i++) {
           imagePath[i-1] = "/images/img" + i + ".gif";
       }
   }
    
}
     
