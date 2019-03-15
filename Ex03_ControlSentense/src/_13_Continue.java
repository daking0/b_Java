/*continue를 사용해서 문제를 해결하라
 * 1부터 100까지 중에 짝수만 출력
 */
public class _13_Continue {

	public static void main(String[] args) {
		for(int i =0; i<=100; i++) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
