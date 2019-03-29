package javaLec.ExUsefulClass.ex01WrapperClass;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue =10; //auto boxing 
		Double dValue = 3.14; //auto boxing
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1 = iValue; //auto unboxing    iValue.intValue()로 호출된 것
		double num2 = dValue; //auto unboxing  dValue.doubleValue()로 호출된 것
		System.out.println(num1); 
		System.out.println(num2); 
	}
}
//클래스로 만든 타입에 스택에 int 타입으로 만든 변수를 넣으면 클래스로 auto boxing