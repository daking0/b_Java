
public class _1_if {

	public static void main(String[] args) {
		
		//if문
//		int num = 10;
//		boolean b = (num % 2 == 0);
//		
//		if(b)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");
		
		//if-else if문
		int num = 11;
		
		if(num % 3 == 0)
			System.out.println("3의 배수");
		else if(num % 3 == 1)
			System.out.println("3으로 나눴을 때 나머지 1");
		else if(num % 3 == 2) //else도 가능
			System.out.println("3으로 나눴을 때 나머지 2");
	}

}
