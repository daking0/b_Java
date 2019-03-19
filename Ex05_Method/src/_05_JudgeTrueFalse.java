import java.util.Scanner;

/*짝수인지 홀수인지 문자열을 리턴하는 메서드를 제작
 * 5개의 정수 배열을 선언
 * 배열에 정수 5개를 키보드로부터 입력받으세요
 * foreach문을 사용해서 메서드에 배열을 입력하고
 * 결과값을 출력
 */
public class _05_JudgeTrueFalse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num_list = new int[5];
		resultArray(InputArray(scan, num_list));
	}
	
	//배열에 5개 선언받기
	public static int[] InputArray(Scanner scan, int[] list) {
		int[] i_array = {0,1,2,3,4};
		
		for(int a : i_array) {
			System.out.print((a+1) + "번째 숫자를 입력하세요: ");
			list[a] = scan.nextInt();
		}
		
		return list;
	}
	
	//출력
	public static void resultArray(int[] list) {
		for(int number: list) {
			if(number % 2 ==0) {
				System.out.println("짝수: "+number);
			}else {
				System.out.println("홀수: "+number);
			}
			
		}
	}
}