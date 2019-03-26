package javaLec._class.ex03calssToClass;

public class PencilSeller {
	int seller_num = 30; // seller 연필개수
	int sellermoney = 0; //seller 돈
	final int pencil_price = 1000;
	
	//판매 메서드
	public int sellPencil(int money) {
		int pnum = money / pencil_price;
		seller_num -= pnum;
		sellermoney += money;
		return pnum;
	}
	
	
	//결과
	public void finishSell() {
		System.out.println("----판매자: 친구 ----");
		System.out.println("연필 남은 수량: "+ seller_num);
		System.out.println("재산: "+ sellermoney);
	}
}
