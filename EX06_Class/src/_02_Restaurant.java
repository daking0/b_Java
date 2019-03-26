import java.util.Arrays;
import java.util.Random;

/*식당 Class
 * 1)명사형과 동사형을 구분한다.
 * 2)명사형은 보통 변수가 된다
 * 3)동사형은 보통 메서드가 된다.
 */
public class _02_Restaurant {
	//필드(변수): 명사
	int money = 100000;
	String[] foods = { "떡볶이", "순대", "라면", "쫄면" };
	int sel; //필드변수는 자동으로 초기화됨
			
	//메서드(기능): 동사		
	void cleaning() {
		System.out.println("식당을 청소한다");
	}
	void prepareFoods() {
		System.out.println("음식 재료를 손질하다");
	}
	void welcom() {
		System.out.println("어서오세요");
	}
	void byebye() {
		System.out.println("안녕히 가세요");
	}
	void getMoney(int m) {
		money += m;
		System.out.println(m + "을 음식값으로 받음");
	}
	void calcMoney() {
		System.out.println("오늘 돈은 "+money+" 이다.");
	}
	void anyFood() {
		System.out.println("어떤 음식 드실래요?");
		System.out.println(Arrays.toString(foods));
		Random rd = new Random();
		sel = rd.nextInt(foods.length);
		System.out.println(foods[sel]+"이요");
	}
	void cookFood() {
		System.out.println(foods[sel]+"을 요리하다");
	}
	void sendFood() {
		System.out.println(foods[sel] +" 나왔습니다");
		System.out.println("맛있게 드세요!");
	}
	
	public static void main(String[] args) {
		//설계도                 리모컨                  실체(객체)
		_02_Restaurant rest = new _02_Restaurant();
		rest.cleaning();
		rest.prepareFoods();
		for(int i=0; i<10;i++) {
			System.out.println("--------------------");
			rest.welcom();
			if(i ==5) {
				rest.foods = new String[] {"쥐","벌레"};
			}
			rest.anyFood();
			rest.cookFood();
			rest.money = -999999999;
			rest.sendFood();
			rest.getMoney(1000);
			rest.byebye();
		}
		rest.calcMoney();
		rest.cleaning();

	}
}
