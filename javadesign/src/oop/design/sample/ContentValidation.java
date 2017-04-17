package oop.design.sample;

import java.util.Arrays;

public class ContentValidation extends Validation{

	@Override
	boolean valid(Files files) {
		
		System.out.println("content valid: header:"+ Arrays.toString(files.getHeader())
		+", body: "+Arrays.deepToString(files.getBody())
		+", footer: "+Arrays.toString(files.getFooter())
		+", length: "+files.getBody().length);
		
		return false;
	}
}
