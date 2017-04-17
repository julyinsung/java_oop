package oop.design.file.valid.sample.one;

import java.util.Arrays;
import java.util.List;

public class FormatValidation extends Validation{

	@Override
	boolean valid(Files files) {
		
		List<String> readAllLines = files.getReadAllLines();
		System.out.println("format valid content line: "+readAllLines.size());
		
		// header
		//String header = readAllLines.get(0);
		files.setHeader(readAllLines.get(0).split("\\|"));

		// footer
		files.setFooter(readAllLines.get(readAllLines.size()).split("\\|"));
		
		
		System.out.println("format valid: header:"+ Arrays.toString(files.getHeader())
		+", body: "+Arrays.deepToString(files.getBody())
		+", footer: "+Arrays.toString(files.getFooter())
		+", length: "+files.getBody().length);
		
		String[] h = files.getHeader();
		h[h.length - 1] = "true";
		
		String[][] b = files.getBody();
		String[] bb = b[0];
		bb[bb.length - 1] = "true";
		b[0] = bb;
		files.setBody(b);
		
		String[] f = files.getFooter();
		f[f.length - 1] = "true";
		
		return false;
	}
	
	private boolean headerValid(String header){
		boolean result = true;
		
		return result;
	}

}
