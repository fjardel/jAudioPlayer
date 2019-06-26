package jaudioplayer_pk;

import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BackPlayer {

	private final JFXPanel jfxPanel = new JFXPanel();

	private Media audio = null;
	protected MediaPlayer player = null;

	protected void load(File file) {

		this.audio = new Media(file.toURI().toString());
		this.player = new MediaPlayer(audio);

	}

	protected void playAudio() {

		if (player != null) {

			player.play();

		}

	}

	protected void pauseAudio() {

		if (player != null) {

			player.pause();

		}

	}

	protected void stopAudio() {

		if (player != null) {

			player.stop();

		}

	}

}