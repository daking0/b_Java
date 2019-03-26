package javaLec._class.ex12This;
/*this�� ��ü�ڽ��� ����Ű�� �ܾ�� self�� �ǹ��Ѵ�.
 */
/*
 * ������ �ÿ� ù��° �Ű������� this�� �߰���
 * �� this�� ��ü�� �������ִ� ������ �Ѵ�
 * Number(int num) -> Number(Number this, int num)
 * void showNum() ->void showNum(Number this) �� ����ȴ�
 * 
 * num1.showNum(); =>showNum(num1);
   num2.showNum(); =>showNum(num2);
 */
class Number{
	private int num;
	//���������� �ʵ庸�� �켱������ �����Ƿ� �ʵ忡 ������ �ȵ�
//	Number(int num){
//		num = num;
//	} num�� ��� 0���� �νĵ�
	
	//���������� ������ �̸��� ��� this�� �ٿ��� �ʵ�� �νĵ�
	Number(int num){
		this.num = num;
		System.out.println("������"+this);
	}
	//���������� �����Ƿ� this ���� ����
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
