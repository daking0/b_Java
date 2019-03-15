/*break, continue는 제어문과 결합해서 사용
 *break: 가장 가까운(나를 감싼) 반복문을 탈출
 *continue : 더이상 아래로 계속가지 말고 돌아가서 계속 진행(필터링)
 */
public class _12_Continue {
	public static void main(String[] args) {
		for(int i =0; i<=9; i++) {
			if(i < 5)
				continue;
			System.out.println(i);
		}

	}

}
