//0부터 100까지 홀수만 역순으로 출력
public class _9_for {
	public static void main(String[] args) {
		for(int i =100; i>=0; i--) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i =99; i>=0; i -=2) {
			System.out.println(i);
		}
	}
}
