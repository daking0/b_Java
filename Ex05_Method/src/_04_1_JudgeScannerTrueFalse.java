import java.util.Scanner;

public class _04_1_JudgeScannerTrueFalse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		judgeTrueFalse(scan);
		scan.close();
	}
	
	public static String judgeTrueFalse(Scanner scan) {
		System.out.print("���� �Է��ϼ���: ");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			return "¦��";
		}else {
			return "Ȧ��";
		}
	}
}
