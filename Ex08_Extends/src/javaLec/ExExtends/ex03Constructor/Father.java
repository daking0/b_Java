package javaLec.ExExtends.ex03Constructor;
//Father�� �θ�Ŭ������ GrandFather
//GrandFather�� �����޾� Ȯ���ߴ�
public class Father extends GrandFather {
	long money = 9999999999999999L;
	Father(){
		System.out.println("Father ������");
	}
	void wealth() {
		System.out.println("���� ���� ������");
	}
}
