package javaLec.ExInterface.ex03_IMP3;
/* 3)Samsung�� Bitcamp�κ��� mp3������ �Ƿڹ޾Ҵ�
 * �׷��� �����ؾ� �� ����� interface�� ��ӹ��� SamsungMP3Ŭ������ �����ϰ� ������ ����.
 * ������ ������ �ٽ� Bitcamp�� ���� ���̴�.
 */
public class SamsungMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("������ �� �鸰��");

	}

	@Override
	public void listenFM() {
		System.out.println("������ �� �鸰��");
	}

	@Override
	public void viewPhoto() {
		System.out.println("������ �ſ� �� ���δ�");

	}

}
