package javaLec._class.ex04Constructor;
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
	int APPLE_PRICE = 1000; //������� - final�� ���� ������ �ʴ� ���!
	
	//�Ǹ� �޼���
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	//�Ǹ� ���
	public void showSaleResult() {
		System.out.println("*****���� ����� ���� ��Ȳ*****");
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
		
	}
	
	//�ʱⰪ�� �����ϴ� �޼���
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	//���� Ȯ�� �޼���
	public int getApplePrice() {
		return APPLE_PRICE;
	}
}
