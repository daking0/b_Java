import java.util.Arrays;
/*�迭�� ����
 * �Ѵ� �������� ����(���� �� ���� ū ����)
 * Arrays.sort(scores); -�����Ͱ� ���� ��
 * Arrays.parallelSort(scores); -�����Ͱ� ���� ��
 * 
 * �� ���� ���ڿ���  �迭�� �����͸� Ȯ���Ϸ��� �� �� Arrays.toString(scores); ->�迭�� ��� ���� ���ڿ�
 */
public class _7_arraySort {

	public static void main(String[] args) {
		int[] scores = {98,12,52,68,78,98,99,100,23,65};
		
		System.out.println(Arrays.toString(scores));
		//����
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}
}



/*
 * Arrays.toString(scores) ->�迭 �ѹ��� Ȯ�� ����
 */
