package jaudioplayer_pk;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class InputFile {

	private FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
	private File file;
	protected String fileChooser = "";

	protected String explorerFile() {

		JFileChooser fChooser = new JFileChooser();
		fChooser.setDialogTitle("Explorer File");
		fChooser.setFileSelectionMode(fChooser.FILES_ONLY);
		fChooser.setFileFilter(filter);

		int result = fChooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {

			fileChooser = fChooser.getSelectedFile().toString();

			return fileChooser;

		} else {

			fileChooser = "";

			return fileChooser;

		}

	}

	protected File createFile(String path) {

		this.file = new File(path);
		return file;

	}

	protected String getName() {

		return this.file.getName();

	}

}
