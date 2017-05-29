package oop.design.file.valid.sample.four;

import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	/**
	 * 폴더에서 파일을 읽는다.
	 * @param path 폴더 path
	 * @return
	 */
	public static List<String> getFileList(String path){
		List<String> fileList = new ArrayList<String>();
		fileList.add("file1");
		fileList.add("file2");
		return fileList;
	}
}
