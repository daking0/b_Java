import java.util.Random;
import java.util.Scanner;

/*1~6 사이의 사용자의 숫자를 입력받는다.
 * 컴퓨터의 난수를 생성한다.
 * 두 수를 비교하고 큰 숫자를 이겼다고 출력한다.
 * 조건 연산자 이용
 * You Win! or Computer Win! or Draw!
 */
public class _3_DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("컴퓨터 입력 중");
		int Cnum = random.nextInt(6) +1; //0~5니까  +1해주기
		
		System.out.print("사용자 입력(1~6): ");
		int Pnum = scan.nextInt();
		
		if(Cnum > Pnum) {
			System.out.println("컴퓨터: "+ Cnum);
			System.out.println("Computer Win!");
		}else if(Cnum < Pnum) {
			System.out.println("컴퓨터: "+ Cnum);
			System.out.println("You Win!");
		}else {
			System.out.println("컴퓨터: "+ Cnum);
			System.out.println("Draw!");
		}
		
	}

}
