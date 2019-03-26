package javaLec.ExOverriding.ex08Overriding;

class Box{
	void wrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box{
	void wrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox{
	void wrap() {
		System.out.println("gold wrap");
	}
}
/*
 * �θ����������� ������ ���� ��
 * : �Ű������� �ֻ��� �θ𺯼��� �޼��� 1���� ����� �ȴ�
 * Overriding�� ���� ��
 * : ��� �θ������������� ������� Overriding �Ǿ��� �޼����
 * ��ü�� ������ �޼��尡 �˾Ƽ� ȣ��ȴ�.
 */
public class InstanceOfMain {
	static void wrapBox(Box box) {
		box.wrap();
		}
	
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox pBox = new PaperBox();
		GoldPaperBox gpBox = new GoldPaperBox();
		wrapBox(box);
		wrapBox(pBox);
		wrapBox(gpBox);
		
	}
}

/*
���� �޼��带 ȣ��������
���� ���̺� ���並 ���� ���� ���ϴ� �޼��带 ����
*/