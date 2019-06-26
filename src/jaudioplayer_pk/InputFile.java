package jaudioplayer_pk;

import java.io.File;

public class InputFile {

	private File file;

	protected File createFile(String path) {

		this.file = new File(path);
		return file;

	}

	protected String getName() {

		return this.file.getName();

	}

}
