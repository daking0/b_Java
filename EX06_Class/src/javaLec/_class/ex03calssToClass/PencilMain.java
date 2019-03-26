//나는 친구에게 2000원을 주고 연필 2자루를 구매했다.
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
