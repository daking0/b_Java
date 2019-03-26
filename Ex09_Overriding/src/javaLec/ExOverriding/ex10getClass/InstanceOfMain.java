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
/*instanceof는 순서를 지켜야 한다.
 *하지만 밑에 클래스 정보로 판단하는 건 순서 상관없다. 정확히 자신이 만들어진 클래스 정보를 매칭하여 확인하므로 정확하게 구별할 수 있다.
*/
public class InstanceOfMain {
	static void wrapBox(Box box) {
		//클래스 정보로 판단 - 순서 상관없다
		Object classObj = box.getClass();
		if(classObj.equals(Box.class)) {
			box.simpleWrap();
		}
		if(classObj.equals(PaperBox.class)) {
			((PaperBox)box).paperWrap(); //강제 형변환
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
