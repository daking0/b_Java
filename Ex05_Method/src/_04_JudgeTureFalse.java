import java.util.Scanner;

/*���ڸ� �Է¹ް� ¦������ Ȧ������ ���ڿ��� �����ϴ� �޼��带 �����ϰ� ����غ�����.
 */
public class _04_JudgeTureFalse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = input(scan);
		result(num1);
	}
	
	public static int input(Scanner scan) {
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		
		return num;
	}
	
	public static void result(int num1) {
		if(num1 %2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}else if(num1 %2 != 0) {
			System.out.println("Ȧ�� �Դϴ�.");
		}
	}

}
