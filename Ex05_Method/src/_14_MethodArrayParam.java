
public class _14_MethodArrayParam {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int[][] arr2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int result = addOneDarr(arr);
		int result2 = addTwoDarr(arr2);
		System.out.println("1차원 배열의 합은 "+result);
		System.out.println("2차원 배열의 합은 "+result2);
	}
	
	public static int addOneDarr(int[] arr) {
		int result =0;
		for(int i =0; i<arr.length;i++) {
			result += arr[i];
		}
		return result;
	}
	
	/*arr는 2차원 배열 전체를 가리키는 reference
	 *arr[i]는 1행의 1차원 배열을 가리키는 reference
	 *arr[i][j]는 int 1개 공간
	 */
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
