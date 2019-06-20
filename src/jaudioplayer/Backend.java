package jaudioplayer;

import java.io.File;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Backend extends Thread{

    private JFileChooser fileExplorer = new JFileChooser();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
    private String pathAudio = "";
    private Player player;
    
    Backend(){
        
        playerAudio();
        
    }
    
    protected void fileExplorer() {

        fileExplorer.setDialogTitle("Audio Explorer");
        fileExplorer.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileExplorer.setFileFilter(filter);

        int result = fileExplorer.showOpenDialog(fileExplorer);

        if (result == JFileChooser.APPROVE_OPTION) {

            File audio = fileExplorer.getSelectedFile();
            pathAudio = audio.getPath();
            //playerAudio();

        }

    }
    
    private void playerAudio() {

        try {

            InputStream audio = this.getClass().getResourceAsStream("/MP3/Switchfoot - You.mp3");
            player = new Player(audio);

        } catch (JavaLayerException e) {

            e.printStackTrace();

        }

    }

    protected void playAudio() {
        
        try {

            player.play();

        } catch (JavaLayerException e) {
            
            
            
        }

    }

    protected void pauseAudio() {

    }

    protected void stopAudio() {

        player.close();

    }

}
