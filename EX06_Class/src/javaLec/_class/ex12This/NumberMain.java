package javaLec._class.ex12This;
/*this는 객체자신을 가리키는 단어로 self를 의미한다.
 */
/*
 * 컴파일 시에 첫번째 매개변수로 this가 추가됨
 * 이 this는 객체를 구별해주는 역할을 한다
 * Number(int num) -> Number(Number this, int num)
 * void showNum() ->void showNum(Number this) 로 변경된다
 * 
 * num1.showNum(); =>showNum(num1);
   num2.showNum(); =>showNum(num2);
 */
class Number{
	private int num;
	//지역변수가 필드보다 우선순위가 높으므로 필드에 저장이 안됨
//	Number(int num){
//		num = num;
//	} num이 계속 0으로 인식됨
	
	//지역변수가 동일한 이름일 경우 this를 붙여야 필드로 인식됨
	Number(int num){
		this.num = num;
		System.out.println("생성자"+this);
	}
	//지역변수가 없으므로 this 생략 가능
	void showNum() {
		System.out.println(num);
	}
}
public class NumberMain {
	public static void main(String[] args) {
		Number num1 = new Number(1);
		System.out.println(num1);
		Number num2 = new Number(2);
		System.out.println(num2);
		num1.showNum(); //showNum(num1);
		num2.showNum(); //showNum(num2);
	}
}
