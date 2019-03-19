
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
		System.out.println("1���� �迭�� ���� "+result);
		System.out.println("2���� �迭�� ���� "+result2);
	}
	
	public static int addOneDarr(int[] arr) {
		int result =0;
		for(int i =0; i<arr.length;i++) {
			result += arr[i];
		}
		return result;
	}
	
	/*arr�� 2���� �迭 ��ü�� ����Ű�� reference
	 *arr[i]�� 1���� 1���� �迭�� ����Ű�� reference
	 *arr[i][j]�� int 1�� ����
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
