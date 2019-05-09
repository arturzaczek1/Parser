package main;

import java.io.FileWriter;
import java.io.IOException;

public class TexFileWriter {

	private static final String FILE_PATH = "C:\\Users\\artur.zaczek\\Desktop\\TaskResult\\";

	public void texWriter() {
		ResultFileParser rfp = new ResultFileParser();
		String write = rfp.getResultFile();
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(FILE_PATH + rfp.getFileName());
			fileWriter.write(write);
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
