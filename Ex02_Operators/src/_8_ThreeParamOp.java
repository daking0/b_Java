import java.util.Scanner;

//사용자로부터 정수를 입력받아라
//홀수인지 짝수인지 조건연산자로 판별하고 결과 출력
public class _8_ThreeParamOp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String a = (num % 2 ==0) ? "짝수" : "홀수";
		System.out.println(a);

//		String strNum = "";
//		if(num % 2 == 0) {
//			strNum = "짝수";
//		}else {
//			strNum = "홀수";
//		}
//		System.out.println(strNum);
		
		scan.close();
	}

}
