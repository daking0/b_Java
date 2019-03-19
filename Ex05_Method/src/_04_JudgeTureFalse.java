import java.util.Scanner;

/*숫자를 입력받고 짝수인지 홀수인지 문자열을 리턴하는 메서드를 제작하고 사용해보세요.
 */
public class _04_JudgeTureFalse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = input(scan);
		result(num1);
	}
	
	public static int input(Scanner scan) {
		System.out.print("문자를 입력하세요: ");
		int num = scan.nextInt();
		
		return num;
	}
	
	public static void result(int num1) {
		if(num1 %2 == 0) {
			System.out.println("짝수 입니다.");
		}else if(num1 %2 != 0) {
			System.out.println("홀수 입니다.");
		}
	}

}
