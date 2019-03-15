import java.util.Scanner;

/*10명의 학생의 점수를 입력받고자한다.
 * 10개의 배열을 선언하고, 10명의 점수를 입력받고
 * 10명의 점수를 거꾸로 출력하세요.
 * 총점과 평균도 출력하세요.
 */
public class _06_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scorelist = new int[10];
		int sum = 0;
		
		//입력받기
		for(int i =0; i < scorelist.length; i++) {
			System.out.println((i+1) + " 번째 점수를 입력하세요: ");
			scorelist[i] = scan.nextInt();
			sum += scorelist[i];
		}
		
		//거꾸로 출력
		for(int i=scorelist.length - 1; i>=0; i--) {
			System.out.println((i+1) + "번째 : "+scorelist[i]);
		}
		//총점과 평균 출력
		double avg = sum / scorelist.length;
		System.out.println("총점은 "+ sum + "이고, 평균은 "+ avg);

	}

}
