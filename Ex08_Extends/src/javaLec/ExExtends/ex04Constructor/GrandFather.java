package javaLec.ExExtends.ex04Constructor;
/* �ƹ��� ǥ�ð� ���� Ŭ������ ������!! java.lang.Object�� ����� �޴´�.
 */
public class GrandFather {
	int handsomeScore;
	GrandFather(int score){
		handsomeScore = score;
		System.out.println("GrandFather ������");
	}
	void handsome() {
		System.out.println("�߻��� ������ "+handsomeScore+"�� ���� �� �����");
	}
}
