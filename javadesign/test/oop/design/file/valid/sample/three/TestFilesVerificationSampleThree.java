package oop.design.file.valid.sample.three;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import oop.design.file.valid.sample.three.Files;
import oop.design.file.valid.sample.three.JoinFile;

public class TestFilesVerificationSampleThree {

	@Test
	public void test() {
		//String filePath = "C:\\Users\\july\\Documents\\project\\Thing_Plug\\4.���⹰\\����\\ccbs\\register\\backup\\20170201\\CC01_IF20170131_0003_REQ";
				//String filePath = "/CC01_IF20170131_0003_REQ";
				
				String filePath = this.getClass().getResource("/CC01_IF20170131_0003_REQ").getPath();
				filePath = filePath.substring(1, filePath.length());
				
				Files join = new JoinFile();
				List<String> fileList = join.getFileList();
				for (String path : fileList) {
					new Process(new JoinFile(), filePath).process();
					
				}
				
				
				//System.out.println(Arrays.toString(join.getFileInfo().getHeader()));
				// 5000라인중에 4998라인을 출력한다.
				System.out.println(Arrays.deepToString(join.getFileInfo().getBody()[4998]));
				System.out.println(">>> isValidFileFormat: "+join.isValidFileFormat());
	}

}
