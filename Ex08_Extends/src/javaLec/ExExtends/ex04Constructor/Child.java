package javaLec.ExExtends.ex04Constructor;
//Child�� �θ�Ŭ������ Father
//Father�� �����޾� Ȯ���ߴ�
public class Child extends Father {
	double day;
	Child(int score, long money, double day){
		super(score,money); //Father�� �Ű����� ������ ����
		this.day = day;
		System.out.println("Child ������");
	}
	void play() {
		System.out.println("�λ��� "+ day+"�� ��̴�");
	}
}
