
public class _03_InitializeArray {

	public static void main(String[] args) {
		//배열의 초기화
		//이렇게 썼다고 해서 스택에 올라가는 것이 아니다.
		//int[] kor = new int[5]와 같이 힙에 올라간다.
		//단, 워낙 배열은 초기화 값을 넣어두는 경우가 많기 때문에 이런 문법을 허용한 것이다. 
		int[] kor = {99, 88, 90, 39, 86};
		for(int i=0; i < kor.length; i++) {
			System.out.println(kor[i] + ", ");
		}
	}
}
