package javaLec.ExOverriding.ex09Array;

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

public class InstanceOfMain {
	static void wrapBox(Box box) {
		box.wrap();
		}
	
	public static void main(String[] args) {
		Box[] boxs = new Box[] {
			new Box(), new PaperBox(), new GoldPaperBox()
		};
		
		for(Box box : boxs) {
			wrapBox(box);
		}
	}
	
//	
//	static void wrapBox(Box[] boxs) {
//		for(Box box : boxs)
//			box.wrap();
//		}
//	
//	public static void main(String[] args) {
//		//�̷��� ����� ��� ����
//		Box[] boxs = new Box[] {
//			new Box(), new PaperBox(), new GoldPaperBox()
//		};
//		
//		wrapBox(box);
//	}
}

/*
���� �޼��带 ȣ��������
���� ���̺� ���並 ���� ���� ���ϴ� �޼��带 ����
*/