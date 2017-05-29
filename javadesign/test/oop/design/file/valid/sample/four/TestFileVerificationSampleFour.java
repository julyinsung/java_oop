package oop.design.file.valid.sample.four;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestFileVerificationSampleFour {

	static Rule joinFileRule;
	
	@BeforeClass
	public static void setUp(){
		joinFileRule = new JoinFileRule();
	}
	
	
	@Test
	public void test() {
		String filePath = this.getClass().getResource("/CC01_IF20170131_0003_REQ").getPath();
		filePath = filePath.substring(1, filePath.length());
		
		/*
		List<String> fileList = FileUtils.getFileList("");
		for (String path : fileList) {
			Files join = new JoinFile(joinFileRule);
			new Process(new JoinFile(joinFileRule), filePath).process();

			//System.out.println(Arrays.toString(join.getFileInfo().getHeader()));
			// 5000라인중에 4998라인을 출력한다.
			System.out.println(Arrays.deepToString(join.getFileInfo().getBody()[4998]));
			System.out.println(">>> isValidFileFormat: "+join.isValidFileFormat());
		}
		
		 */
		
		Files join = new JoinFile(joinFileRule);
//		/System.out.println(">>> filePath=" + filePath);
		new Process(join, filePath).process();
		System.out.println(Arrays.deepToString(join.getFileInfo().getBody()[4998]));
		System.out.println(">>> isValidFileFormat: "+join.isValidFileFormat());
	}

}
