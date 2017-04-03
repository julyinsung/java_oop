package oop.abstractclass;

import java.util.Map;

interface ValidationIF {
	boolean status = false;
	
	void valid();
	boolean isStatus();
	Map<String, String> map();
}
