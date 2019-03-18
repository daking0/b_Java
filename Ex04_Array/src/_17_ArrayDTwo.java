
public class _17_ArrayDTwo {
	public static void main(String[] args) {
		//1)2차원 배열 ->각 행마다 다른 개수일 때 주로 쓴다
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[14];
		arr2[2] = new int[4];
		
		//2)2차원 배열
		int[][] arr3 = new int[3][];
		for(int i=0;i<arr2.length;i++)
			arr2[i] = new int[4];
		
		//3)2차원 배열 ->테이블 형태는 이렇게 바로 만드는 게 좋다
		int[][] arr4 = new int[3][4];
		for(int i=0; i<arr4.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = i*4 + j*1;
			}
		}
		
		int result2 = addTwoDarr(arr2);
		
		System.out.println("2차원 배열의 합은 "+result2);
	}
	
	public static int addTwoDarr(int[][] arr) {
		int result = 0;
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				result += arr[i][j];
			}
		}
		return result;
	}
}
