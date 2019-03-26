package javaLec._class.ex06Constructors;

public class PencilSeller {
	int seller_num ; // seller 연필개수
	int sellermoney; //seller 돈
	final int PENCIL_PRICE ;
	
	//생성자
	PencilSeller(){
		seller_num = 30;
		sellermoney = 0;
		PENCIL_PRICE = 1000;
		System.out.println("Defalt 생성자");
	}
	
	PencilSeller(int nsell, int nmonmey, int nmoney){
		seller_num = nsell;
		sellermoney = nmonmey;
		PENCIL_PRICE = nmoney;
		System.out.println("매개 변수 있는 생성자");
	}
	
	//판매 메서드
	public int sellPencil(int money) {
		int pnum = money / PENCIL_PRICE;
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
	
	
	public int checkPrice() {
		return PENCIL_PRICE;
	}
}
