import java.util.Arrays;

public class _16_ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		System.arraycopy(arr, 2, temp, 2, 3); //arr �ε���2���� temp�� 2���� 3����ŭ �����ض�
		System.arraycopy(arr, 1, temp, 3, 2); 
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		//arr�� �ε��� 2��°���� 3����ŭ temp�� 2��°���� 3�����ٰ� ����
	}

}
