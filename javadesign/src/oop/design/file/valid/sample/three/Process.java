package oop.design.file.valid.sample.three;

public class Process {

	private Files file;
	private String filePath;
	
	public Process(Files file, String filePath) {
		this.file = file;
		this.filePath = filePath;
	}
	
	public void process(){
		read();
		verifyFile();
		insert();
		deleteFile();
	}
	
	private void read(){
		file.readFile(filePath);
	}
	
	private void verifyFile(){
		FileVerification format = new FormatVerification();
		format.check(file);
		
		FileVerification content = new ContentVerification();
		content.check(file);
	}
	
	// DB에 데이타를 인서트 한다.
	private void insert(){
		System.out.println(">>> insert...");
	}
	
	// 처리가 완료되면 파일을 삭제한다.
	private void deleteFile(){
		System.out.println(">>> delete File...");
	}
}
