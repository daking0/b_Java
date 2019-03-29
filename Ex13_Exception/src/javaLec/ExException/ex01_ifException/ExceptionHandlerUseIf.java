package javaLec.ExException.ex01_ifException;
/* C��� �������� ����ó���� if������ ó���ߴ�.
 * ������ �����ڵ�� ����ó���ڵ尡 ����ġ�� �ݺ��ǰ� 
 * �����ڵ庸�� ����ó���ڵ尡 �ξ� �� �������� �Ǿ���.
 * �׷��Ƿ� �ڵ��� �������� �������� ����� �����.
 * �׷��� C++�� �����ڵ念���� ����ó�� ������ �и��ϴ� ����ó����� ������ �����Ͽ���.
 * JAVA�� C++�� ���·� ź���Ǿ���, C++�� ���ؼ� ����ó���� �ξ� �� ��ȭ�Ͽ��� �� �����Ͽ���. 
 */
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandlerUseIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i=0; i<3;i++) {
			
			System.out.println("������ ���� �Է�");
			int num1 = scan.nextInt();
			System.out.println("���� ���� �Է�");
			int num2 = scan.nextInt();
			
			if(num2 ==0) {
				System.out.println("������ 0�� �� �� ����");
				i--;
				continue;
			}
			System.out.println("���� ����� ������ �迭 �ε��� �Է�");
			int idx = scan.nextInt();
			if(idx < 0 || idx > 99) {
				System.out.println("��ȿ���� ���� �ε��� �Դϴ�");
				i--;
				continue;
			}
			arr[idx] = num1 /num2;
			System.out.println("������ ����� "+ arr[idx]);
			System.out.println("����� ��ġ�� �ε����� " + idx);
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}
