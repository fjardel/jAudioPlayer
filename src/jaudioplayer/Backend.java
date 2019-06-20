package jaudioplayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Backend extends Thread{

    private JFileChooser fileExplorer = new JFileChooser();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
    private Player player;
        
    protected void fileExplorer() throws FileNotFoundException {

        fileExplorer.setDialogTitle("Audio Explorer");
        fileExplorer.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileExplorer.setFileFilter(filter);

        int result = fileExplorer.showOpenDialog(fileExplorer);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileExplorer.getSelectedFile();
            playerAudio(file);

        }

    }
    
    private void playerAudio(File file) throws FileNotFoundException {

        try {

            InputStream audio = new FileInputStream(file); 
            player = new Player(audio);

        } catch (JavaLayerException e) {

            e.printStackTrace();

        }

    }

    protected void playAudio() {
        
        try {

            player.play();

        } catch (JavaLayerException e) {
            
            //
            
        }

    }

    protected void pauseAudio() {
        
        //

    }

    protected void stopAudio() {

        player.close();

    }

}
