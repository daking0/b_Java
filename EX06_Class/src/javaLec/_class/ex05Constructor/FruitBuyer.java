package javaLec._class.ex05Constructor;
/*(���� ��������)���� ������ ���.
 * 
 */
public class FruitBuyer {
	int myMoney = 5000; //���� �ݾ�
	int numOfApple = 0; //��� ����
	
	//���� �޼���
	//FruitBuyer�� FruitSeller�� �����Ѵ�(�ʿ�� �Ѵ�)
	public void buyApple(FruitSeller seller, int money) {
		
		//seller ��ü���� �޼��� ����(Message Passing)
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	//public void buyApple1(int money) {

	
	//���� ���
	public void showBuyResult() {
		System.out.println("*****���� �������� ���� ��Ȳ*****");
		System.out.println("���� �ܾ�: "+ myMoney);
		System.out.println("��� ����: "+ numOfApple);
	}
}
