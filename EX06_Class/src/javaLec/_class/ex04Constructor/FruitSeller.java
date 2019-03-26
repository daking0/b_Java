package javaLec._class.ex04Constructor;
/* <클래스와 클래스간의 상호관계>
 * 나는 과일장수에게 사과 2개를 구매했다.
 * 1)명사 : 나, 과일장수, 사과
 * 2)동사 : 구매했다
 * 사과는 나,과일장수에 비해 작으니까 field가 될 확률이 높다
 * 나, 과일장수는 class가 될 확률이 높다
 * ↓
 * 3)나와 과일장수는 Class의 대상
 * 4)사과는 field
 * 5)구매했다는 메서드 
 */
//(나의 관점에서)내가 과일을 샀다.
public class FruitSeller {
	int numOfApple = 20; //사과 보유량
	int myMoney = 0; //판매 금액
	int APPLE_PRICE = 1000; //사과가격 - final은 값이 변하지 않는 상수!
	
	//판매 메서드
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	//판매 결과
	public void showSaleResult() {
		System.out.println("*****과일 장수의 현재 상황*****");
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
		
	}
	
	//초기값을 설정하는 메서드
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	//가격 확인 메서드
	public int getApplePrice() {
		return APPLE_PRICE;
	}
}
