import java.util.Arrays;
import java.util.Scanner;

/*�迭�� ���� 10�� �Է¹ޱ�
 * 1)for���� �̿��ؼ� �񱳹������ �ּҰ��� �ִ밪 ���ϱ�
 2)Arrays.sort�� �̿��ؼ� �ּҰ��� �ִ밪 ���ϱ�
 */
public class _8_ArrayMinMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[10];
		
		//�迭 �Է¹ޱ�
		for(int i =0; i<list.length;i++) {
			System.out.println((i+1) +"��° �Է��ϼ���.");
			list[i] = scan.nextInt();
		}
		
		//1)for�� �̿�
		//�ִ밪 ã��
		int most =0 , small = list[0];
		for(int i=0; i<list.length;i++) {
			if(most <= list[i]) {
				most = list[i];
			}
		}
		//�ּҰ� ã��
		for(int i=0; i<list.length;i++) {
			if(small > list[i]) {
				small = list[i];
			}
		}
		
		System.out.println("ū ����: "+ most + "�̰�, ���� ����: "+small);
		
		//2)sort �̿�
		Arrays.sort(list);
		System.out.println("ū ����: "+ list[9] + "�̰�, ���� ����: "+list[0]);

	}

}
