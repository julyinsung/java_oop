package oop.design.file.valid.sample.four;

import java.util.Map;

/**
 * 파일의 스팩정보및 상태정보를 담는다.
 * @author july
 *
 */
public class FileInfo {

	private String folderPath;
	private String[] header;
	private String[][] body;
	private String[] footer;
	private Rule rule;
	
	public String getFolderPath() {
		return folderPath;
	}

	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

	public String[] getHeader() {
		return header;
	}

	public void setHeader(String[] header) {
		this.header = header;
	}

	public String[][] getBody() {
		return body;
	}
	
	public void setBody(String[][] body) {
		this.body = body;
	}

	public String[] getFooter() {
		return footer;
	}

	public void setFooter(String[] footer) {
		this.footer = footer;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
}
