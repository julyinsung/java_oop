package oop.design.file.valid.sample.two;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class Files {

	private List<String> readAllLines;
	private FileVerification validation; 
	private FileInfo fileInfo;
	
	public List<String> getFileList(){
		List<String> fileList = new ArrayList<String>();
		fileList.add("file1");
		fileList.add("file2");
		return fileList;
	}

	public void processFile(String filePath){
		readFile(filePath);
		formatValid();
		contentValid();
	}
	
	private boolean formatValid(){
		validation = new FormatVerification();
		return validation.check(this);
	}
	
	private boolean contentValid(){
		validation = new ContentVerification();
		return validation.check(this);
	}

	private void readFile(String filePath){
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
}
