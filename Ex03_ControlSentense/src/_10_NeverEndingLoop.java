import java.util.Scanner;

/*무한루프
 * if 조건 + break문과 같이 사용될 경우가 많다
 * 1) while(true)
 * 2)do{
 *    }while(true)
 * 3)for(;;)
 */

/*숫자 입력받기
 *입력받은 숫자를 더해라
 *-1이 입력되면 더한 숫자 출력하고 종료
 */
public class _10_NeverEndingLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0, result =0;
		
		for(;;) {
			System.out.println("숫자 입력(-1이면 종료)");
			num = scan.nextInt();
			if(num == -1){
				System.out.println(result);
				break;
			}
			result += num;
			
		}
		scan.close();

	}
}
