package javaLec.ExUsefulClass.ex01WrapperClass;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue =10; //auto boxing 
		Double dValue = 3.14; //auto boxing
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1 = iValue; //auto unboxing    iValue.intValue()�� ȣ��� ��
		double num2 = dValue; //auto unboxing  dValue.doubleValue()�� ȣ��� ��
		System.out.println(num1); 
		System.out.println(num2); 
	}
}
//Ŭ������ ���� Ÿ�Կ� ���ÿ� int Ÿ������ ���� ������ ������ Ŭ������ auto boxing