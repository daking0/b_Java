package javaLec.ExExtends.ex03Constructor;
//Child�� �θ�Ŭ������ Father
//Father�� �����޾� Ȯ���ߴ�
public class Child extends Father {
	double day = 365 + 1.0/4;
	Child(){
		System.out.println("Child ������");
	}
	void play() {
		System.out.println("�λ��� ��̴�");
	}
}
