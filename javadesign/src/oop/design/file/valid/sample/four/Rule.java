package oop.design.file.valid.sample.four;

import java.util.Map;

public abstract class Rule {

	abstract Map<String, Integer> getContentsColumnCount();
	abstract Map<String, Integer> getHeaderColumnLength();
	abstract Map<String, Integer> getLengthPerBodyColumn();
}
