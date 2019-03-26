package javaLec._class.ex13MethodOverloading;
/*
 �̸��� ���� �޼��尡 ������ �����ϴ� ���� �޼��� �����ε��̶�� �Ѵ�.
 �̸��� �����ϰ� �ϰ� �˾Ƽ� Ÿ���� �����Ͽ� ���� �־� ���� ���ϴ� ���� �����°� 
 */
class CalcAdder{
	static int add(int num1, int num2) {
		System.out.println("int ����");
		return num1 + num2;
	}
	static double add(double num1, double num2) {
		System.out.println("double ����");
		return num1 + num2;
	}
}
class Adder{
	int num1, num2 ;
	int result;
	Adder(){
		//�ڵ����� �ʵ�� 0���� �ʱ�ȭ ������ 
		//��������� ���ִ� ������ ����� �ڵ带 ��������� Ȯ���ϰ�;
		num1 = num2 = result =0;
	}
	Adder(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void calc() {
		this.result = this.num1 + this.num2; //this �����ص� ������ ��������� ����ʵ����� �˵��� ������
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
