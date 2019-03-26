package javaLec._class.ex06Constructors;

public class PencilMe {
	int pencil_num = 0; //연필개수
	int Mymoney = 5000;
	
	//구매 메서드
	public int buyPencil(PencilSeller sell, int money) {
		int ppnum = sell.sellPencil(money);
		pencil_num += ppnum;
		Mymoney -= money;
		
		return pencil_num;
	}
	
	
	//결과
	public void finishSell() {
		System.out.println("----구매자: 나 ----");
		System.out.println("연필 구매 수량: "+ pencil_num);
		System.out.println("재산: "+ Mymoney);
	}
	
	
}
