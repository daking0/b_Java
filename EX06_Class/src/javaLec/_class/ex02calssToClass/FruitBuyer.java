package javaLec._class.ex02calssToClass;
/*(나의 관점에서)내가 과일을 샀다.
 * 
 */
public class FruitBuyer {
	int myMoney = 5000; //보유 금액
	int numOfApple = 0; //사과 개수
	final int APPLE_PRICE = 1000; //사과가격 - final은 값이 변하지 않는 상수!
	
	//구매 메서드
	public int buyApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple += num;
		myMoney -= money;
		
		return num;
	}
	
	//구매 결과
	public void showBuyResult() {
		System.out.println("*****과일 구매자의 현재 상황*****");
		System.out.println("현재 잔액: "+ myMoney);
		System.out.println("사과 개수: "+ numOfApple);
	}
}
