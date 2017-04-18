package oop.design.file.valid.sample.two;

import java.util.Arrays;

import org.junit.Test;

public class TestFileValidSampleTwo {

	@Test
	public void test() {
		String filePath = "C:\\Users\\july\\Documents\\project\\Thing_Plug\\4.산출물\\최종\\ccbs\\register\\backup\\20170201\\CC01_IF20170131_0003_REQ";
		
		Files join = new JoinFile();
		join.fileList();
		join.processFile(filePath);
		
		//System.out.println(Arrays.toString(join.getFileInfo().getHeader()));
		System.out.println(Arrays.deepToString(join.getFileInfo().getBody()[4998]));
	}
}
