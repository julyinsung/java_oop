package oop.abstractclass;

import java.util.HashMap;
import java.util.Map;

public class FileValidation implements ValidationIF{

	boolean status = false;
	
	public FileValidation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void valid() {
		System.out.println("FileValidation: valid");
		status = true;
	}
	
	@Override
	public boolean isStatus() {
		return status;
	}

	@Override
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
		return map;
	}
}
