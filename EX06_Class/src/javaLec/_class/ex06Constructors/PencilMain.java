//���� ģ������ 2000���� �ְ� ���� 2�ڷ縦 �����ߴ�.
package javaLec._class.ex06Constructors;

public class PencilMain {
	public static void main(String[] args) {
		PencilSeller seller = new PencilSeller();
		PencilSeller seller1 = new PencilSeller(20,1000,2000);
		
		PencilMe me = new PencilMe();
		
		if(seller.checkPrice()>seller1.checkPrice()) {
			me.buyPencil(seller1, 2000);
		}else {
			me.buyPencil(seller, 2000);
		}
		
		
		
		me.finishSell();
//		seller.finishSell();
//		seller1.finishSell();
	}
	
}
