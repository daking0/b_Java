package javaLec._class.ex06Constructors;

public class PencilSeller {
	int seller_num ; // seller ���ʰ���
	int sellermoney; //seller ��
	final int PENCIL_PRICE ;
	
	//������
	PencilSeller(){
		seller_num = 30;
		sellermoney = 0;
		PENCIL_PRICE = 1000;
		System.out.println("Defalt ������");
	}
	
	PencilSeller(int nsell, int nmonmey, int nmoney){
		seller_num = nsell;
		sellermoney = nmonmey;
		PENCIL_PRICE = nmoney;
		System.out.println("�Ű� ���� �ִ� ������");
	}
	
	//�Ǹ� �޼���
	public int sellPencil(int money) {
		int pnum = money / PENCIL_PRICE;
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
	
	
	public int checkPrice() {
		return PENCIL_PRICE;
	}
}
