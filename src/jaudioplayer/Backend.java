package jaudioplayer;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Backend {
    
    private JFileChooser fileExplorer = new JFileChooser();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
    private String pathAudio = "url empty";
    
    protected void fileExplorer() {
        
        fileExplorer.setDialogTitle("Audio Explorer");
        fileExplorer.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileExplorer.setFileFilter(filter);
        
        int result = fileExplorer.showOpenDialog(fileExplorer);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            
            File audio = fileExplorer.getSelectedFile();
            pathAudio = audio.getPath();
            playerAudio();
            
        } else {
            
            playerAudio();
            
        }
        
    }
    
    private void playerAudio() {
        
        System.out.println(pathAudio);
        
    }
    
    protected void playAudio() {
        
        System.out.println("Play");
        
    }
    
    protected void pauseAudio() {
        
        System.out.println("Pause");
        
    }
    
    protected void stopAudio() {
        
        System.out.println("Stop");
        
    }
    
}
