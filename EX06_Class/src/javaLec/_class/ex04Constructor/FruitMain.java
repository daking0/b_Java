package javaLec._class.ex04Constructor;
/*
 * initMember�޼���� ���� ������ �� �־� ��ü���� �ٸ� ������ ����������
 * �׷���, APPLE_PRICE�� ��� -> ������ �����߸��ϰ�
 * initMember�� �����ʰ� ȣ���ؾ߸� �Ѵ�.
 * �̷� �� ������ �ʱ�ȭ �Լ��� ���� �ʰ� ������ �Լ��� �̿��ϸ� ���ϴ�.
 */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitSeller seller1 = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		seller.initMembers(10000, 20, 1000);
		seller1.initMembers(10000, 15, 1500);
		
		if(seller.getApplePrice() > seller1.getApplePrice()) {
			buyer.buyApple(seller1, 1500);
		}else {
			buyer.buyApple(seller, 2000);
		}

		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
