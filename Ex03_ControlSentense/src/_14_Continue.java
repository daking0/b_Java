/*1~100까지 각각 홀수와 짝수의 합을 continue를 사용해서 출력
 */
public class _14_Continue {

	public static void main(String[] args) {
		int sum1 = 0, sum2 =0;
		for(int i =0; i<=100; i++) {
			if(i % 2 ==0) {
				sum1 += i;
				continue;
			}
			sum2 += i ;
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
