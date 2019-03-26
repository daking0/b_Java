package javaLec._class.ex13MethodOverloading;
/*
 이름이 같은 메서드가 여러개 존재하는 것을 메서드 오버로딩이라고 한다.
 이름을 동일하게 하고 알아서 타입을 변경하여 값을 넣어 각각 원하는 답을 꺼내는것 
 */
class CalcAdder{
	static int add(int num1, int num2) {
		System.out.println("int 리턴");
		return num1 + num2;
	}
	static double add(double num1, double num2) {
		System.out.println("double 리턴");
		return num1 + num2;
	}
}
class Adder{
	int num1, num2 ;
	int result;
	Adder(){
		//자동으로 필드는 0으로 초기화 되지만 
		//명시적으로 해주는 이유는 사람이 코드를 명시적으로 확인하고싶어서
		num1 = num2 = result =0;
	}
	Adder(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void calc() {
		this.result = this.num1 + this.num2; //this 생략해도 되지만 명시적으로 멤버필드임을 알도록 적어줌
	}
	void showResult() {
		System.out.println(result);
	}
}

public class ArithMain {
	public static void main(String[] args) {
		Adder adder1 = new Adder(10,20);
		adder1.calc();
		adder1.showResult();
		
		Adder adder2 = new Adder(10,20);
		adder2.calc();
		adder2.showResult();
		
		System.out.println(CalcAdder.add(10,20));
		System.out.println(CalcAdder.add(10.5, 20.3));
	}
}
