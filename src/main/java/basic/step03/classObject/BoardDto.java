package basic.step03.classObject;

public class BoardDto {
	//필드.
	private int boardSeq;
	private String boardName;
	private String boardCnt;
	private String regName;
	private String regId;
	private String regDate;
	
	//메소드.	(getter, setter 메소드 자동완성 가능)
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardCnt() {
		return boardCnt;
	}
	public void setBoardCnt(String boardCnt) {
		this.boardCnt = boardCnt;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
