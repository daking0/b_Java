package javaLec.ExUsefulClass.ex01WrapperClass;

class IntWrapper{
	private int num;
	public IntWrapper(int data) {
		this.num = data;
	}
	public String toString() {
		return ""+num; //���ڸ� ���ڷ�
	}
}

public class WrappingInteger {
	public static void showData(Object obj) {
		System.out.println(obj); //toString�� �θ����� �Ǿ��ִ�
	}
	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));
	}
}
/* int�� Ŭ������ �ƴ϶� Ÿ��
*/