/*1~100���� ���� Ȧ���� ¦���� ���� continue�� ����ؼ� ���
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
