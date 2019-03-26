package javaLec.ExOverriding.ex07instanceOf;

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
/*instanceof�� �ش� Ŭ������ ��ȯ�� �����ϳ�
 *�ش� Ŭ�����̰ų� ����� �޾Ҵ��� 
 *�ش��ϸ� true, �ƴϸ� false
 *
 * ��Ӱ������� ���� �ڽĺ��� �˻��ؾ߸� �Ѵ�.
 * �θ�����ϸ� ������ �ɸ�!
*/
public class InstanceOfMain {
	static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		}
		else if(box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		}
		else if(box instanceof Box) {
			box.simpleWrap();
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
