package javaLec.ExException.ex02_Exception;
/* C��� �������� ����ó���� if������ ó���ߴ�.
 * ������ �����ڵ�� ����ó���ڵ尡 ����ġ�� �ݺ��ǰ� 
 * �����ڵ庸�� ����ó���ڵ尡 �ξ� �� �������� �Ǿ���.
 * �׷��Ƿ� �ڵ��� �������� �������� ����� �����.
 * �׷��� C++�� �����ڵ念���� ����ó�� ������ �и��ϴ� ����ó����� ������ �����Ͽ���.
 * JAVA�� C++�� ���·� ź���Ǿ���, C++�� ���ؼ� ����ó���� �ξ� �� ��ȭ�Ͽ��� �� �����Ͽ���. 
 */
import java.util.Arrays;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlerUseException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i=0; i<3;i++) {
			//������ �õ��ϴ�.(���� ����)
			try {
			System.out.println("������ ���� �Է�");
			int num1 = scan.nextInt();
			System.out.println("���� ���� �Է�");
			int num2 = scan.nextInt();
			System.out.println("���� ����� ������ �迭 �ε��� �Է�");
			int idx = scan.nextInt();
			arr[idx] = num1 /num2;
			System.out.println("������ ����� "+ arr[idx]);
			System.out.println("����� ��ġ�� �ε����� " + idx);
			}catch(ArithmeticException e) { //catch���� try������ �߻��� ���ܸ� ó��(����ó�� ����)
				System.out.print(e.getMessage());
				e.printStackTrace();
				System.out.println("������ 0�� �� �� ����");
				i--;
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
				System.out.println(" ��ȿ���� ���� �ε��� �Դϴ�");
				i--;
				continue;
//			}catch(InputMismatchException e) {
//				System.out.println("����ó��");
//			}
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	}
	}
