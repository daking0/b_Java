import java.util.Scanner;

/*2개의 숫자를 double로 입력(nextDouble)
 * 연산자(+ - * /)입력 (nextLine)
 * 결과 출력
 */
/*nextInt(), nextDouble()같은 메서드를 사용했을 때 이후에 nextLine()을 사용하면 
 * 남아있는 \n을 읽어들이기 때문에 nextLine()메서드가 바로 리턴해버린다.
 * 그러므로 nextLine()을 호출하기 전에 nextLine()을 한 번 써주면 
 * 버퍼에 있는 \n읽어버리므로 그 다음 문자열이 잘 읽힌다.
 * =>next()는 개행문자, 공백은 무시하고 문자를 입력받습니다.
 * => nextLine()은 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식합니다.
 * 
 * == : 같은 객체를 참조하는가
 * equals : 내용물이 같은가
 * Java는 반드시 내용을 비교할 때는 (동일 문자열인지 비교) equals를 써야만한다.
*/
public class _4_ArithCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1 입력");
		double num1 = scan.nextDouble();
		scan.nextLine(); //이걸 안쓰면 다음 입력값을 할 때 엔터친걸 입력으로 인식
		System.out.println("숫자2 입력");
		double num2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("연산자 입력");
		String calc = scan.nextLine();
		double result=0.0;
		
		//이렇게도 가능!
		//String temp = scan.nextLine();
		//num1 = Double.parseDouble(temp);
		
		
//		switch(calc) {
//		case "+":
//			result = num1 + num2;
//			break;
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
//		}
//		
		if(calc.equals("+")) {
			result = num1 + num2;
		}else if(calc.equals("-")) {
			result = num1 - num2;
		}else if(calc.equals("*")) {
			result = num1 * num2;
		}else if(calc.equals("/")) {
			result = num1 / num2;
		}else {
			System.out.println("잘못 입력");
		}
			
		
		System.out.println("결과는 "+ result);

		scan.close();
	}
}
