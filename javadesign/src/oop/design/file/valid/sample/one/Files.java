package oop.design.file.valid.sample.one;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * 파일을 핸들링 하는 추상 클래스를 생성.
 * 파일리스트, read 파일, 파일 validation을 주 목적으로 함.
 * 
 * 하지만 클래스 다이어그램에서 보듯이 조금 지저분해 보이고 변경 가능성이 있는 것을 분리 할 예정.
 *  
 * @author july
 */
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
	
	public List<String> fileList(){
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
