package javaLec._class.ex05Constructor;
/*(나의 관점에서)내가 과일을 샀다.
 * 
 */
public class FruitBuyer {
	int myMoney = 5000; //보유 금액
	int numOfApple = 0; //사과 개수
	
	//구매 메서드
	//FruitBuyer는 FruitSeller를 의존한다(필요로 한다)
	public void buyApple(FruitSeller seller, int money) {
		
		//seller 객체한테 메세지 전달(Message Passing)
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	//public void buyApple1(int money) {

	
	//구매 결과
	public void showBuyResult() {
		System.out.println("*****과일 구매자의 현재 상황*****");
		System.out.println("현재 잔액: "+ myMoney);
		System.out.println("사과 개수: "+ numOfApple);
	}
}
