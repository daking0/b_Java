//���� ģ������ 2000���� �ְ� ���� 2�ڷ縦 �����ߴ�.
package javaLec._class.ex03calssToClass;

public class PencilMain {
	public static void main(String[] args) {
		PencilSeller seller = new PencilSeller();
		PencilMe me = new PencilMe();
		
		me.buyPencil(seller, 2000);
		
		
		me.finishSell();
		seller.finishSell();
	}
	
}
