import java.util.Random;
import java.util.Scanner;

/*1~6 ������ ������� ���ڸ� �Է¹޴´�.
 * ��ǻ���� ������ �����Ѵ�.
 * �� ���� ���ϰ� ū ���ڸ� �̰�ٰ� ����Ѵ�.
 * ���� ������ �̿�
 * You Win! or Computer Win! or Draw!
 */
public class _3_DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("��ǻ�� �Է� ��");
		int Cnum = random.nextInt(6) +1; //0~5�ϱ�  +1���ֱ�
		
		System.out.print("����� �Է�(1~6): ");
		int Pnum = scan.nextInt();
		
		if(Cnum > Pnum) {
			System.out.println("��ǻ��: "+ Cnum);
			System.out.println("Computer Win!");
		}else if(Cnum < Pnum) {
			System.out.println("��ǻ��: "+ Cnum);
			System.out.println("You Win!");
		}else {
			System.out.println("��ǻ��: "+ Cnum);
			System.out.println("Draw!");
		}
		
	}

}
