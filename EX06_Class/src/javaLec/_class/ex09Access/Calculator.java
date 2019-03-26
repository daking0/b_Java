package javaLec._class.ex09Access;

//외부에서 사용하게 만드는데 목적을 둔다
//더하기와 빼기의 기능을 제공한다
public class Calculator {
	private Adder adder;
	private Subtractor subtractor;
	
	//생성자가 public이어야만 외부에서 객체 생성이 가능하다
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int num1, int num2) {
		return adder.addTwoNumber(num1, num2);
	}
	public int subTwoNumber(int num1, int num2) {
		return subtractor.subTwoNumber(num1, num2);
	}
	public void showOperatingTimes() {
		System.out.println("덧셈 회수: "+adder.getCntAdd());
		System.out.println("뺄셈 회수: "+subtractor.getCntSub());
	}
	
}
