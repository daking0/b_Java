package javaLec.ExInterface.ex03_IMP3;

import java.util.Random;

/* 5)Bitcamp�� IMP3�� �Ű������� �޾Ƽ� MP3TestManagerŬ������ ������ ���ư�
 * Samsung, LG, Sony�� ���� interface�� �Ƿڸ� �޾� ������ ���ƴ�.
 * ������ ��ģ Ŭ������ Bitcamp�� ������ �׽�Ʈ�� �����Ѵ�.
 */
/* Ŭ������ 3���� ����
 * 1)���� Ŭ���� : ���� ������ ���ҷ� ������ ��� ������ ��
 *              ���� ����� ������ �Ѵٸ�, �ڽ� Ŭ�������� Ư���� ���� �� �ȴ뵵 �Ǵ� �������� ��� ����
 * 2)�߻� Ŭ���� : �Ϻδ� ����� ���� ��� ��������������
 * 				�Ϻδ� �ڽ��� �˾Ƽ� �����ؾ� �� �� 
 * 3)�������̽� : �ϳ��� ������ �� ���� �̸� �޼��常 ������ ���� ��/ Ŭ�������� �Ծ��� ���� ������ ��(������)
 * 
 * ����� ����
 * 1)Ŭ���� ���(extends) : ���� �з�(A)�� ���� �з�(B)�� �� �����̴�
 * 						 A is a kind of B
 * 2)�������̽� ���(implements =����) : ���� Ŭ����(A)�� �������̽�(B) �� �� �־�� �Ѵ�. (Framework, java Language)
 * 						 A is able to B
 * 						 AutoCloseable, Appendable, Cloneable, Runnable �� ��ӹ޾� �����ϸ� 
 * 						  �ڹ��� �ٸ� ��ü�� �� �Ծ࿡ ���� ȣ���ϰ� �ȴ�.(��� ����)
 */

public class MP3Main {
	public static void main(String[] args) {
		//1)Samsung�� ���� ��ǰ�� �����Դ�.
		SamsungMP3 sMp3 = new SamsungMP3();
		
		//2)Bitcamp�� �Ｚ mp3�� �׽�Ʈ�ϱ� ���� MP3TestManager��ü�� �����.
		MP3TestManager mp3Tm = new MP3TestManager(sMp3);
		mp3Tm.listenTest();
		mp3Tm.playTest();
		mp3Tm.viewTest();
		System.out.println("-----------ù �׽�Ʈ---------");
		
		//3)��ħ LG�� Sony�� mp3�� �����Դ�. �Բ� �׽�Ʈ �غ���
		IMP3[] mp3s = new IMP3[] {
				sMp3, new LGMP3(), new SonyMP3()
		};
		
		for(IMP3 mp3 : mp3s) {
			mp3Tm.setMP3(mp3);
			mp3Tm.listenTest();
			mp3Tm.playTest();
			mp3Tm.viewTest();
			System.out.println("-----------------------");
		}
		
		Random rand = new Random();
		int sel = rand.nextInt(2);
		if(sel == 0)
			System.out.println("Samsung�� ����");
		else if(sel == 1)
			System.out.println("LG�� ����");

	}
}
