package oop.design.file.valid.sample.one;

public class JoinFile extends Files{

	static final String folderPath = "join folder path";
	static final int header_column = 5;
	static final int body_column = 15;
	static final int footer_column = 2;
	
	public JoinFile() {
		super(folderPath, header_column, body_column, footer_column);
	}
}
