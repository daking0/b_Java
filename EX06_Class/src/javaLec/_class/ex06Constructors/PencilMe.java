package javaLec._class.ex06Constructors;

public class PencilMe {
	int pencil_num = 0; //���ʰ���
	int Mymoney = 5000;
	
	//���� �޼���
	public int buyPencil(PencilSeller sell, int money) {
		int ppnum = sell.sellPencil(money);
		pencil_num += ppnum;
		Mymoney -= money;
		
		return pencil_num;
	}
	
	
	//���
	public void finishSell() {
		System.out.println("----������: �� ----");
		System.out.println("���� ���� ����: "+ pencil_num);
		System.out.println("���: "+ Mymoney);
	}
	
	
}
