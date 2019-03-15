/*현업에서도 마찬가지인데
 *for문에서 가장 많이 쓰이는 문법은
 *for(int i=0;i<10;i++)
 */
public class _09_foreach {

	public static void main(String[] args) {
		int[] scores = {89,99,100,21,10};
		
		//for문을 이용한 접근
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]+", ");
		}
		System.out.println();
		
		//foreach문을 이용한 접근
		for(int score : scores) {
			System.out.println(score + ", ");
		}
	}

}
