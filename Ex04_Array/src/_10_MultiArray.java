/*다차원 배열(2차원 이상의 배열)
 * 실제로는 90%이상 1차원 배열만 쓴다
 */
public class _10_MultiArray {
	public static void main(String[] args) {
		//자료형 int[] 변수 scores
		//int[] scores = {10, 20};
		
		//자료형 int[][] 변수arr
		//2차원 배열을 가리키는 참조(Reference)변수가 다시 5개의 참조변수를 생성한다.
		int[][] arr = new int[5][]; //2차원배열
		System.out.println(arr);
		
		//5개의 참조변수에 다시 int 3개를 할당함
		arr[0] =new int[3];
		arr[1] =new int[3];
		arr[2] =new int[3];
		arr[3] =new int[3];
		arr[4] =new int[3];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
