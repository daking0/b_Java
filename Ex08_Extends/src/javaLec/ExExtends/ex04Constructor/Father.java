package javaLec.ExExtends.ex04Constructor;
//Father�� �θ�Ŭ������ GrandFather
//GrandFather�� �����޾� Ȯ���ߴ�
public class Father extends GrandFather {
	long money = 9999999999999999L;
	Father(int score, long money){
		super(score); //GrandFather�� �Ű����� �����ڸ� ȣ�� (GrandFather�� ó�� ����ϴ� ������ �־������)
		this.money = money;
		System.out.println("Father ������");
	}
	void wealth() {
		System.out.println("���� "+ money +" ������");
	}
}
