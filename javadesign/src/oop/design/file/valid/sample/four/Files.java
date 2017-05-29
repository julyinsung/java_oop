package oop.design.file.valid.sample.four;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

public abstract class Files {

	private List<String> readAllLines;
	private FileInfo fileInfo;
	private boolean isValidFileFormat;
	private boolean isValidFileContent;
	
	public void readFile(String filePath){
		Path path = FileSystems.getDefault().getPath(filePath);
		
		try {
			List<String> readAllLines = java.nio.file.Files.readAllLines(path);
			setReadAllLines(readAllLines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getReadAllLines() {
		return readAllLines;
	}

	public void setReadAllLines(List<String> readAllLines) {
		this.readAllLines = readAllLines;
	}

	public FileInfo getFileInfo() {
		return fileInfo;
	}

	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}

	public boolean isValidFileFormat() {
		return isValidFileFormat;
	}

	public void setValidFileFormat(boolean isValidFileFormat) {
		this.isValidFileFormat = isValidFileFormat;
	}

	public boolean isValidFileContent() {
		return isValidFileContent;
	}

	public void setValidFileContent(boolean isValidFileContent) {
		this.isValidFileContent = isValidFileContent;
	}
}
