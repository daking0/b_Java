
public class _16_ReculFactorial {

	public static void main(String[] args) {
		//for문을 사용한 factorial
		//1*2*3*4*5
		System.out.println(forFactorial(5));
		//재귀호출을 사용한 factorial
		System.out.println(factorial(5));
	}
	
	public static int forFactorial(int num) {
		int fact = 1;
		for(int i=1; i <= num;i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	//재귀호출 (실수하면 오류발생 높아진다)
	public static int factorial(int num) {
		if(num == 1)
			return 1;
		else
			return num * factorial(num -1); 
	}
	//5! = 5 * 4! 
	//2! = 2 * 1!
}
