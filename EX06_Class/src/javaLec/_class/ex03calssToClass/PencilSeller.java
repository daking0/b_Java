package javaLec._class.ex03calssToClass;

public class PencilSeller {
	int seller_num = 30; // seller ���ʰ���
	int sellermoney = 0; //seller ��
	final int pencil_price = 1000;
	
	//�Ǹ� �޼���
	public int sellPencil(int money) {
		int pnum = money / pencil_price;
		seller_num -= pnum;
		sellermoney += money;
		return pnum;
	}
	
	
	//���
	public void finishSell() {
		System.out.println("----�Ǹ���: ģ�� ----");
		System.out.println("���� ���� ����: "+ seller_num);
		System.out.println("���: "+ sellermoney);
	}
}
