package oop.design.file.valid.sample.four;

/**
 *  등록파일에 대한 정보를 설정한다.
 *  생성자에서 FileInfo클래스를 생성하여 공통으로 쓰일 값들을 저장한다.
 *  
 * @author july
 *
 */
public class JoinFile extends Files{

	static final String folderPath = "join folder path";
	
	public JoinFile(Rule joinFileRule) {
		FileInfo fileInfo = new FileInfo();
		fileInfo.setFolderPath(folderPath);
		fileInfo.setRule(joinFileRule);
		super.setFileInfo(fileInfo);
	}
	

}
