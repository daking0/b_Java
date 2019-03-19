/*continue는 반복문을 돌려보내서 계속 실행
 *return은 함수를 호출한 곳으로 돌려보낸다.(즉, 끝낸다)
 */
public class _02_continue_return {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i+" ");
		} //2 4 6 8 10 12 14 16 18 20 
		
		System.out.println();
		
		for(int i=1;i<=20;i++) {
			if(i % 2 == 0) {
				return;
			}
			System.out.print(i+" ");
		}//1 
	}
}
