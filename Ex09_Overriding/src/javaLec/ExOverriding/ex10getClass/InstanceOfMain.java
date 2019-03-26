package javaLec.ExOverriding.ex10getClass;

class Box{
	void simpleWrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box{
	void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox{
	void goldWrap() {
		System.out.println("gold wrap");
	}
}
/*instanceof�� ������ ���Ѿ� �Ѵ�.
 *������ �ؿ� Ŭ���� ������ �Ǵ��ϴ� �� ���� �������. ��Ȯ�� �ڽ��� ������� Ŭ���� ������ ��Ī�Ͽ� Ȯ���ϹǷ� ��Ȯ�ϰ� ������ �� �ִ�.
*/
public class InstanceOfMain {
	static void wrapBox(Box box) {
		//Ŭ���� ������ �Ǵ� - ���� �������
		Object classObj = box.getClass();
		if(classObj.equals(Box.class)) {
			box.simpleWrap();
		}
		if(classObj.equals(PaperBox.class)) {
			((PaperBox)box).paperWrap(); //���� ����ȯ
		}
		if(classObj.equals(GoldPaperBox.class)) {
			((GoldPaperBox)box).goldWrap();
		}
		
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
