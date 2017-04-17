package oop.design.file.valid.sample.one;

public class CancelFile extends Files{

	static final String folderPath = "cancel folder path";
	static final int header_column = 5;
	static final int body_column = 9;
	static final int footer_column = 1;
	
	public CancelFile() {
		super(folderPath, header_column, body_column, footer_column);
	}
}
