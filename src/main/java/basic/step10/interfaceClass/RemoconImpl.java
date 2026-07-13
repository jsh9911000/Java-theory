package basic.step10.interfaceClass;

public class RemoconImpl implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨을 키워요~!");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 낮춰요~!");
	}

}
