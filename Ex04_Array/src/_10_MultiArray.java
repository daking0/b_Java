/*������ �迭(2���� �̻��� �迭)
 * �����δ� 90%�̻� 1���� �迭�� ����
 */
public class _10_MultiArray {
	public static void main(String[] args) {
		//�ڷ��� int[] ���� scores
		//int[] scores = {10, 20};
		
		//�ڷ��� int[][] ����arr
		//2���� �迭�� ����Ű�� ����(Reference)������ �ٽ� 5���� ���������� �����Ѵ�.
		int[][] arr = new int[5][]; //2�����迭
		System.out.println(arr);
		
		//5���� ���������� �ٽ� int 3���� �Ҵ���
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
