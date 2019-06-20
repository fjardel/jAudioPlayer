package jaudioplayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Backend extends Thread {//Estendendo a classe Thread

    private JFileChooser fileExplorer = new JFileChooser();
    private FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
    private Player player;
    protected String nameAudio = "";

    protected void fileExplorer() throws FileNotFoundException {//Método para selecionar arquivo

        fileExplorer.setDialogTitle("Audio Explorer");//Titulo da janela de seleção de arquivos
        fileExplorer.setFileSelectionMode(JFileChooser.FILES_ONLY);//Limitar a busca de arquivos a apenas arquivos
        fileExplorer.setFileFilter(filter);//Filtro, declarado no inicio da classe

        int result = fileExplorer.showOpenDialog(fileExplorer);//Para verificar se a o arquivo foi selecionado

        if (result == JFileChooser.APPROVE_OPTION) {//Se algum arquivo foi selecionado...

            File file = fileExplorer.getSelectedFile();//...Uma variavel do tipo File é criada
            nameAudio = file.getName();//Recebendo o nome do arquivo
            loadAudio(file);//Chama a classe que carrega o arquivo enviado o File

        }

    }

    private void loadAudio(File file) throws FileNotFoundException {//Classe para carregar o arquivo de audio

        try {

            InputStream audio = new FileInputStream(file);//Um arquivo de InputStream é criado tendo o File como referência
            player = new Player(audio);//Objeto do jLayer

        } catch (JavaLayerException e) {

            e.printStackTrace();

        }

    }

    /*
    O metodo playAudio executa o audio que foi previamente carregado.
    Para que o programa não congele, foi necessario sobreescreber o 
    metodo Rum() da classe Thread, somente assim a interface GUI pode
    ser executada ao mesmo tempo que a musica
    */
    
    protected void playAudio() {

        new Thread() {//Criando uma thread

            @Override
            public void run() {//Sobre escrevendo o metodo run()

                try {

                    player.play();

                } catch (JavaLayerException e) {

                    e.printStackTrace();
                    
                }

            }

        }.start();

    }

    protected void pauseAudio() {

    }

    protected void stopAudio() {//Metodo para parar a musica

        player.close();

    }

}
