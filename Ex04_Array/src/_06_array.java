import java.util.Scanner;

/*10���� �л��� ������ �Է¹ް����Ѵ�.
 * 10���� �迭�� �����ϰ�, 10���� ������ �Է¹ް�
 * 10���� ������ �Ųٷ� ����ϼ���.
 * ������ ��յ� ����ϼ���.
 */
public class _06_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scorelist = new int[10];
		int sum = 0;
		
		//�Է¹ޱ�
		for(int i =0; i < scorelist.length; i++) {
			System.out.println((i+1) + " ��° ������ �Է��ϼ���: ");
			scorelist[i] = scan.nextInt();
			sum += scorelist[i];
		}
		
		//�Ųٷ� ���
		for(int i=scorelist.length - 1; i>=0; i--) {
			System.out.println((i+1) + "��° : "+scorelist[i]);
		}
		//������ ��� ���
		double avg = sum / scorelist.length;
		System.out.println("������ "+ sum + "�̰�, ����� "+ avg);

	}

}
