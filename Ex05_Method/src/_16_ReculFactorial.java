
public class _16_ReculFactorial {

	public static void main(String[] args) {
		//for���� ����� factorial
		//1*2*3*4*5
		System.out.println(forFactorial(5));
		//���ȣ���� ����� factorial
		System.out.println(factorial(5));
	}
	
	public static int forFactorial(int num) {
		int fact = 1;
		for(int i=1; i <= num;i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	//���ȣ�� (�Ǽ��ϸ� �����߻� ��������)
	public static int factorial(int num) {
		if(num == 1)
			return 1;
		else
			return num * factorial(num -1); 
	}
	//5! = 5 * 4! 
	//2! = 2 * 1!
}
