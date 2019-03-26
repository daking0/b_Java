package javaLec._class.ex05Constructor;
/*
 * initMember�޼���� ���� ������ �� �־� ��ü���� �ٸ� ������ ����������
 * �׷���, APPLE_PRICE�� ��� -> ������ �����߸��ϰ�
 * initMember�� �����ʰ� ȣ���ؾ߸� �Ѵ�.
 * �̷� �� ������ �ʱ�ȭ �Լ��� ���� �ʰ� ������ �Լ��� �̿��ϸ� ���ϴ�.
 */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();//Default ������ ȣ��
		FruitSeller seller1 = new FruitSeller(1000, 20 , 1500); //�Ű����� �ִ� ������ȣ��
		FruitBuyer buyer = new FruitBuyer();
		
		if(seller.getApplePrice() > seller1.getApplePrice()) {
			buyer.buyApple(seller1, 1500);
		}else {
			buyer.buyApple(seller, 2000);
		}

		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
