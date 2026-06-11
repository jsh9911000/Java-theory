package basic.step03.classObject;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("메인메소드를 시작합니다.");
		
		Computer.color = "빨간색";	//static 필드.
		
		BoardDto dto = new BoardDto();
		dto.setRegId("test");
		dto.setRegName("홍길동");
		dto.setBoardName("게시판명");
		dto.setBoardCnt("게시글 내용");
		
		String boardName = dto.getBoardName();
		int boardSeq = dto.getBoardSeq();
		
		
		System.out.println("메인메소드를 시작합니다.");
	}

}
