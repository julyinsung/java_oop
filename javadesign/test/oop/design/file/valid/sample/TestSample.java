package oop.design.file.valid.sample;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;

import oop.design.file.valid.sample.one.Files;
import oop.design.file.valid.sample.one.JoinFile;

public class TestSample {

	String filePath = "C:\\Users\\july\\Documents\\project\\Thing_Plug\\4.산출물\\최종\\ccbs\\register\\backup\\20170201\\CC01_IF20170131_0002_REQ";
	//Path filePath = FileSystems.getDefault().getPath(basePath, "CC01_IF20170131_0002_REQ");
	
	@Test
	public void test() {
		Files join = new JoinFile();
		join.fileList();
		join.processFile(filePath);
	}

	@Test
	public void testReadFile(){
		
		String basePath = "C:\\Users\\july\\Documents\\project\\Thing_Plug\\4.산출물\\최종\\ccbs\\register\\backup\\20170201";
		Path filePath = FileSystems.getDefault().getPath(basePath, "CC01_IF20170131_0002_REQ");
	}
}
