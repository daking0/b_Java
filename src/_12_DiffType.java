
public class _12_DiffType {

	public static void main(String[] args) {
		//정수와 정수의 연산의 결과는 정수
		int num0 = 10;
		int num1 = 3;
		System.out.println(num0/num1);
		
		//실수와 정수의 연산은 정수가 실수로 자동변환되고 연산이 이루어진다.
		//double이 우선순위가 높아서 num이 double이 됨
		int num =10;
		double dNum = 3;
		System.out.println(num / dNum);
	}

}
