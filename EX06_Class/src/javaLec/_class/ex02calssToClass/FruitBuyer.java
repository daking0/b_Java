package javaLec._class.ex02calssToClass;
/*(���� ��������)���� ������ ���.
 * 
 */
public class FruitBuyer {
	int myMoney = 5000; //���� �ݾ�
	int numOfApple = 0; //��� ����
	final int APPLE_PRICE = 1000; //������� - final�� ���� ������ �ʴ� ���!
	
	//���� �޼���
	public int buyApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple += num;
		myMoney -= money;
		
		return num;
	}
	
	//���� ���
	public void showBuyResult() {
		System.out.println("*****���� �������� ���� ��Ȳ*****");
		System.out.println("���� �ܾ�: "+ myMoney);
		System.out.println("��� ����: "+ numOfApple);
	}
}
