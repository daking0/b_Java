/*10개짜리 int 배열을 선언하고 
 * 1부터 10까지 배열을 저장하고 
 * for문을 이용해서 출력하세요.
 */
public class _04_array {

	public static void main(String[] args) {
		int[] list = new int[10];
		
		for(int i =0; i<10; i++) {
			list[i]=i+1;
		}
		
		for(int i =0; i<10; i++) {
			System.out.println(list[i]);
		}

	}

}
