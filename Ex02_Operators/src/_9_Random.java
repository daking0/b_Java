import java.util.Random;
/*난수(임의의 수) - 순서를 임의대로 바꿀 때
일정범위에서 임의의 수를 얻고 싶을 때 사용
ex)주사위 게임 
*/
public class _9_Random {

	public static void main(String[] args) {
		Random random = new Random();
		//10 미만의 임의 정수 출력
		for(int j =0; j < 10; j++) {
			for(int i =0; i<20;i++) {
				int num = random.nextInt(10);
				System.out.print(num + ", ");
			}
			System.out.println();
		}
		
		
	}

}
