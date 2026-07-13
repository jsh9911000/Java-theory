package basic.step10.interfaceClass;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		useDrill(new RemoconDrill() {
			@Override
			public void hole() {
				System.out.println("리모콘 드릴을 사용합니다~!");
			}
		});
		
		//override한 메소드가 1개일 때 람다식을 사용.
		useDrill(() -> {
			System.out.println("천장에 구멍을 뚫어요~!");
		});
		
		System.out.println("메인 메소드를 종료합니다.");
	}
	
	public static void useDrill(RemoconDrill d) {
		d.hole();
	}

}
