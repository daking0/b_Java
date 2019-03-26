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
 * 부모참조변수에 담으면 좋은 점
 * : 매개변수를 최상위 부모변수로 메서드 1개만 만들면 된다
 * Overriding이 좋은 점
 * : 비록 부모참조변수에는 담았지만 Overriding 되어진 메서드는
 * 객체에 구현된 메서드가 알아서 호출된다.
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
같은 메서드를 호출하지만
내부 테이블 검토를 통해 실제 원하는 메서드를 실행
*/