import java.util.Arrays;

public class _13_MultiArray {

	public static void main(String[] args) {
		int[][] arr =new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
		int cnt =0;
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j<arr[i].length;j++) { //length�� ��� ������ �������� �迭 ũ�⿡ ��ȭ ����
				arr[i][j] = cnt++; 
			}
		}
		
		for(int[] temp : arr) {
			System.out.println(Arrays.toString(temp)); //���� �� �پ� ���
		}
	}

}
