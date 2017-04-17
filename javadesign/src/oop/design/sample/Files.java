package oop.design.sample;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class Files {

	private String folderPath;
	private int headerColumn;
	private int bodyColumn;
	private int footerColumn;
	private String[] header;
	private String[][] body;
	private String[] footer;
	private List<String> readAllLines;
	
	private Validation validation; 
	
	public Files(String folderPath, int headerColumn, int bodyColumn, int footerColumn) {
		this.folderPath = folderPath;
		this.headerColumn = headerColumn;
		this.bodyColumn = bodyColumn;
		this.footerColumn = footerColumn;
	}
	
	List<String> fileList(){
		System.out.println("folder path: "+folderPath);
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
		validation = new FormatValidation();
		return validation.valid(this);
	}
	
	private boolean contentValid(){
		validation = new ContentValidation();
		return validation.valid(this);
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
	
	public String[] getHeader() {
		return header;
	}

	public void setHeader(String[] header) {
		this.header = header;
	}

	public String[][] getBody() {
		return body;
	}
	
	public void setBody(String[][] body) {
		this.body = body;
	}

	public String[] getFooter() {
		return footer;
	}

	public void setFooter(String[] footer) {
		this.footer = footer;
	}

	public List<String> getReadAllLines() {
		return readAllLines;
	}

	public void setReadAllLines(List<String> readAllLines) {
		this.readAllLines = readAllLines;
	}

	public int getHeaderColumn() {
		return headerColumn;
	}

	public int getBodyColumn() {
		return bodyColumn;
	}

	public int getFooterColumn() {
		return footerColumn;
	}
}
