package javaLec._class.ex01calssToClass;
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
	final int APPLE_PRICE = 1000; //������� - final�� ���� ������ �ʴ� ���!
	
	//�Ǹ� �޼���
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	//public void saleApple1(FruitBuyer buyer,int money) {
	
	
	//�Ǹ� ���
	public void showSaleResult() {
		System.out.println("*****���� ����� ���� ��Ȳ*****");
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
		
	}
}
