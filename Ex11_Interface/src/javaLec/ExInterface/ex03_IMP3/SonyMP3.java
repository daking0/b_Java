package javaLec.ExInterface.ex03_IMP3;
/* 3)Sony�� Bitcamp�κ��� mp3������ �Ƿڹ޾Ҵ�
 * �׷��� �����ؾ� �� ����� interface�� ��ӹ��� SonyMP3Ŭ������ �����ϰ� ������ ����.
 * ������ ������ �ٽ� Bitcamp�� ���� ���̴�.
 */
public class SonyMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("mp3�Ҹ��� ���ڱ� �������Ҹ��� �ٲ��.");

	}

	@Override
	public void listenFM() {
		System.out.println("�ƺ��� ������ ���׶��̶�� ����.");

	}

	@Override
	public void viewPhoto() {
		System.out.println("�ƺ������� ���ڱ� ���");

	}

}
