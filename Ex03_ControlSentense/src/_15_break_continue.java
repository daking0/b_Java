/* 구구단 출력
 * 구구단의 2~9단의 뒤의 숫자가 1~5까지 출력 
 * 1)break사용해서 해결
 * 2)continue 사용해서 해결
 */
public class _15_break_continue {

	public static void main(String[] args) {
		//break 사용
		for(int i =2; i<10; i++) {
			for(int j=1; j<9; j++) {
				if(j>5) {
					break;
				}
				System.out.println(i + " * "+j + " = "+ i*j);
			}
		}

		//continue 사용
		for(int i =2; i<10; i++) {
			for(int j=1; j<9; j++) {
				if(j>5) {
					continue;
				}
				System.out.println(i + " * "+j + " = "+ i*j);
			}
		}

	}

}
