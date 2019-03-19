/*1)2차원 int 배열 4행 5열을 만들어서 1부터 1개씩 값을 증가시켜 채워 넣어서 반환하는 메서드
 *2)1번에서 반환한 메서드를 매개변수로 받아서 모두 합을 구해 반환하는 메서드 제작
 *3)main함수에서는 1,2번 메서드를 사용해보세요.
 */
public class _15_MethodMakeDTwoArray {
	public static void main(String[] args) {
		int[][] resultArray =getDTwoArray();
		int result =getSumDTwoArray(resultArray);
		System.out.println("결과는 "+ result);
	}
	
	public static int[][] getDTwoArray(){
		int cnt =1;
		int[][] arr = new int[4][5];
		for(int i=0; i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				arr[i][k] = cnt++;
			}
		}
		return arr;
	}
	
	public static int getSumDTwoArray(int[][] arr) {
		int result =0;
		for(int i=0; i < arr.length;i++) {
			for(int k=0; k<arr[i].length;k++) {
				result += arr[i][k];
			}
		}
		return result;
	}

}
