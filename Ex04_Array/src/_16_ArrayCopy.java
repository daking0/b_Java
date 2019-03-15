import java.util.Arrays;

public class _16_ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		System.arraycopy(arr, 2, temp, 2, 3); //arr 인덱스2부터 temp의 2에서 3개만큼 복사해라
		System.arraycopy(arr, 1, temp, 3, 2); 
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		//arr의 인덱스 2번째부터 3개만큼 temp의 2번째부터 3개에다가 복사
	}

}
