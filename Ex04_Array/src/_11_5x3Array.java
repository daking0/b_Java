/* 5 x 3 2���� �迭�� 0~14 �� ä���ְ� / ����ϱ�
 */
public class _11_5x3Array {

	public static void main(String[] args) {
		//�迭 ����
		int[][] arr = new int[5][];
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[2] = new int[3];
		arr[3] = new int[3];
		arr[4] = new int[3];
		
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			int[] temp = arr[i];
			for(int j=0; j <arr[i].length; j++) {
				temp[j] = cnt++;
			}
		}
		
		//�̷��Ե� ����
//		for(int i = 0; i<5; i++) {
//			int[] temp = arr[i];
//			for(int j=0; j <3; j++) {
//				arr[i][j] = cnt++;
//			}
//		}
//		
		//���
		for(int i = 0; i<5; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(arr[i][j] + ", ");
			}
		}
	}

}