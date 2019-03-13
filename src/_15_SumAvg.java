import java.util.Scanner;

//3명의 점수를 입력받고 총합과 평균을 출력
public class _15_SumAvg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg =0;
		
		System.out.println("첫번째 입력");
		int num1 = scan.nextInt();
		
		System.out.println("첫번째 입력");
		int num2 = scan.nextInt();
				
		System.out.println("첫번째 입력");
		int num3 = scan.nextInt();
				
		sum = num1 + num2 + num3;
		avg = sum/(double)3;
		
		System.out.println("총합은 "+ sum);
		System.out.println("평균은 "+ avg);
		
		System.out.format("평균 소수 2자리 %.2f\n", avg);
		System.out.println(String.format("평균 소수 3자리 %.3f\n", avg));
	}

}
