package oop.design.file.valid.sample.four;

public class ContentVerification extends FileVerification{

	@Override
	public void check(Files files) {
		
		FileInfo fileInfo = files.getFileInfo();
		String[][] body = fileInfo.getBody();
		
		checkBody(body, fileInfo);
		
	}

	private void checkBody(String[][] body, FileInfo fileInfo) {
		
		checkDuplicateId(body);
		
		fileInfo.setBody(body);
	}
	
	private boolean checkDuplicateId(String[][] body) {
		boolean result = true; 
		String aid = body[0][2];
		String eid = body[0][3];
		
		for (String[] v : body) {
			String v_aid = v[2];
			String v_eid = v[3];
//			System.out.println("aid:v_aid("+aid+":"+v_aid+"), eid:e_aid("+eid+":"+v_eid+")");

			if(!aid.equals(v_aid) || !eid.equals(v_eid)){
				result = false;
				break;
			}
		}
		return result;
	}

	private void setResultCoe(String[][] body, String code){
		//System.out.println("setResultCoe");
		for (String[] v : body) {
			v[v.length -1] = code;
		}
	}
}
