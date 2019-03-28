package javaLec.ExInterface.ex03_IMP3;
/* 3)Sony는 Bitcamp로부터 mp3제작을 의뢰받았다
 * 그래서 구현해야 할 목록인 interface를 상속받은 SonyMP3클래스를 제작하고 구현에 들어간다.
 * 구현이 끝나면 다시 Bitcamp에 보낼 것이다.
 */
public class SonyMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("mp3소리가 갑자기 강아지소리가 바뀐다.");

	}

	@Override
	public void listenFM() {
		System.out.println("아베가 독도는 지네땅이라고 우긴다.");

	}

	@Override
	public void viewPhoto() {
		System.out.println("아베사진이 갑자기 뜬다");

	}

}
