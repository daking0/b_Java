package javaLec._class.ex02calssToClass;
/* <Ŭ������ Ŭ�������� ��ȣ����>
 * ���� ����������� ��� 2���� �����ߴ�.
 * 1)��� : ��, �������, ���
 * 2)���� : �����ߴ�
 * ����� ��,��������� ���� �����ϱ� field�� �� Ȯ���� ����
 * ��, ��������� class�� �� Ȯ���� ����
 * ��
 * 3)���� ��������� Class�� ���
 * 4)����� field
 * 5)�����ߴٴ� �޼��� 
 */
//(���� ��������)���� ������ ���.
public class FruitSeller {
	int numOfApple = 20; //��� ������
	int myMoney = 0; //�Ǹ� �ݾ�
	FruitBuyer buyer = new FruitBuyer(); 
	//�Ǹ� �޼���
//	public int saleApple(int money) {
//		int num = money / APPLE_PRICE;
//		numOfApple -= num;
//		myMoney += money;
//		return num;
//	}
	
	public void saleApple(FruitBuyer buyer,int money) {
		numOfApple -= buyer.buyApple(money);
		myMoney += money;
	}
	
	
	//�Ǹ� ���
	public void showSaleResult() {
		System.out.println("*****���� ����� ���� ��Ȳ*****");
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
		
	}
}
