/*1)2���� int �迭 4�� 5���� ���� 1���� 1���� ���� �������� ä�� �־ ��ȯ�ϴ� �޼���
 *2)1������ ��ȯ�� �޼��带 �Ű������� �޾Ƽ� ��� ���� ���� ��ȯ�ϴ� �޼��� ����
 *3)main�Լ������� 1,2�� �޼��带 ����غ�����.
 */
public class _15_MethodMakeDTwoArray {
	public static void main(String[] args) {
		int[][] resultArray =getDTwoArray();
		int result =getSumDTwoArray(resultArray);
		System.out.println("����� "+ result);
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
