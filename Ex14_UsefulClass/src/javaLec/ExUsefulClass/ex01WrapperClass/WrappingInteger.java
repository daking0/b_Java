package javaLec.ExUsefulClass.ex01WrapperClass;

class IntWrapper{
	private int num;
	public IntWrapper(int data) {
		this.num = data;
	}
	public String toString() {
		return ""+num; //숫자를 문자로
	}
}

public class WrappingInteger {
	public static void showData(Object obj) {
		System.out.println(obj); //toString을 부르도록 되어있다
	}
	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));
	}
}
/* int는 클래스가 아니라 타입
*/