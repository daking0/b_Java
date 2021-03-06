package javaLec._class.ex05Constructor;
/*
 * initMember메서드로 값을 변경할 수 있어 객체마다 다른 구성이 가능해졌다
 * 그러나, APPLE_PRICE를 상수 -> 변수로 만들어야만하고
 * initMember를 잊지않고 호출해야만 한다.
 * 이럴 때 별도로 초기화 함수를 두지 않고 생성자 함수를 이용하면 편리하다.
 */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();//Default 생성자 호출
		FruitSeller seller1 = new FruitSeller(1000, 20 , 1500); //매개변수 있는 생성자호출
		FruitBuyer buyer = new FruitBuyer();
		
		if(seller.getApplePrice() > seller1.getApplePrice()) {
			buyer.buyApple(seller1, 1500);
		}else {
			buyer.buyApple(seller, 2000);
		}

		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
