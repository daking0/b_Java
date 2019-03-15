import java.util.Scanner;

/*while :몇 번 반복할지 모르면 사용
 *do~while : 1번은 실행하고 나서 판단하고 싶을 때
 *for : 시작과 끝이 명확할 때
 *상호호환이 된다
 */

/*사용자로부터 숫자를 입력받고
 * 나무를 해당 숫자만큼 찍으세요
 * 마지막으로 나무가 쿵 출력
*/
public class _6_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		
		while(num > 0) {
			sum++;
			num--;
			System.out.println("나무를 " +sum + "번 찍었다.");
		}
		System.out.println("쿵");
//		
//		int i =0;
//		while(i<num) {
//			i++;
//			System.out.println("나무"+i+"찍었다");
//		}
//		System.out.println("쿵");
	}

}
