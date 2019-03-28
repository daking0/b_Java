package javaLec.ExInterface.ex03_IMP3;
/* 3)Samsung는 Bitcamp로부터 mp3제작을 의뢰받았다
 * 그래서 구현해야 할 목록인 interface를 상속받은 SamsungMP3클래스를 제작하고 구현에 들어간다.
 * 구현이 끝나면 다시 Bitcamp에 보낼 것이다.
 */
public class SamsungMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("음악이 잘 들린다");

	}

	@Override
	public void listenFM() {
		System.out.println("라디오가 잘 들린다");
	}

	@Override
	public void viewPhoto() {
		System.out.println("사진이 매우 잘 보인다");

	}

}
