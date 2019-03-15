import java.util.Scanner;

/*정수를 입력하라
 * 입력받은 숫자 중에 3자리 수만 더해라 (100 ~ 999)
 * 다른 자리 숫자가 입력되면 3자리만 입력하세요 라고 출력
 * exit 입력하면 더한 값을 출력하고 종료
*/
public class _11_for_break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 ="";
		int num =0, result =0;
		
		while(true) {
			System.out.println("입력하세요.");
			num1 =scan.nextLine();
			
			if(num1.equals("exit")) {
				System.out.println(result);
				break;
			}else{
				num = Integer.parseInt(num1);
				if(num - 100 >=0) {
					result += num;
				}else {
					System.out.println("잘못입력");
				}
			}
		}
//		temp = num /100;
//	    if(temp > = 1 && temp <=9)
//		   sum += num
		scan.close();
	}
}
