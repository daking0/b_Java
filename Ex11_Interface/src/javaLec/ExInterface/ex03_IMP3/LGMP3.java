
package javaLec.ExInterface.ex03_IMP3;
/* 3)LG�� Bitcamp�κ��� mp3������ �Ƿڹ޾Ҵ�
 * �׷��� �����ؾ� �� ����� interface�� ��ӹ��� LGMP3Ŭ������ �����ϰ� ������ ����.
 * ������ ������ �ٽ� Bitcamp�� ���� ���̴�.
 */
public class LGMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("������ �ε巴�� �鸰��.");
	}

	@Override
	public void listenFM() {
		System.out.println("������ ������� ���� �´�");
	}

	@Override
	public void viewPhoto() {
		System.out.println("������ �ǹ����� ���� ǥ���ȴ�");
	}

}
