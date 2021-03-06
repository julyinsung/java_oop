package oop.design.file.valid.sample.four;

import java.util.Collection;
import java.util.List;

public class FormatVerification extends FileVerification{

	@Override
	public void check(Files files) {
		
		//if(files instanceof JoinFile){System.out.println("instanceof JoinFile");}
		
		int lines = files.getReadAllLines().size();
		String header = files.getReadAllLines().get(0);
		String footer = files.getReadAllLines().get(lines - 1);
		List<String> body = files.getReadAllLines().subList(1, lines - 1);
		
		//for (String s : body) { System.out.println(s);	}
		
		FileInfo fileInfo = files.getFileInfo();
		
		boolean isValidHeader = checkHeader(header, fileInfo);
		
		boolean isValidBody = checkBody(body, fileInfo);
		
		if(isValidHeader && isValidBody){
			files.setValidFileFormat(true);
		} else {
			files.setValidFileFormat(false);
		}
	}
	
	private boolean checkHeader(String content, FileInfo fileInfo){
		boolean result = true;
		
		String[] header = content.split("\\|");
		fileInfo.setHeader(header);
	
		int headerColumnCount = fileInfo.getRule().getContentsColumnCount().get("Header");
		if(checkColumnCount(header, headerColumnCount)){
			
			Collection<Integer> charLength = fileInfo.getRule().getLengthPerBodyColumn().values();
			if(!checkLengthPerColumn(header, charLength)){
				result = false;
			}
		} else {
			result = false;
		}
		
		return result;
	}

	private boolean checkBody(List<String> body, FileInfo fileInfo) {
		boolean result = true;
		int bodyColumnCount = fileInfo.getRule().getContentsColumnCount().get("Body");
		Collection<Integer> charLength = fileInfo.getRule().getLengthPerBodyColumn().values();
		
		int size = body.size();
		String[][] bodys = new String[size][bodyColumnCount];
		
		for (int i = 0; i < size; i++) {
			String[] line = body.get(i).split("\\|", bodyColumnCount);
			
			if(checkColumnCount(line, bodyColumnCount)){
				
				if(!checkLengthPerColumn(line, charLength)){
					line[line.length -1] = "99";
					result = false;
				}
			} else {
				line[line.length -1] = "99";
				result = false;
			}
			bodys[i] = line;
		}
		
		fileInfo.setBody(bodys);
		
		return result;
	}

}
