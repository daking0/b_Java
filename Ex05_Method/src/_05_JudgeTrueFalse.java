import java.util.Scanner;

/*¦������ Ȧ������ ���ڿ��� �����ϴ� �޼��带 ����
 * 5���� ���� �迭�� ����
 * �迭�� ���� 5���� Ű����κ��� �Է¹�������
 * foreach���� ����ؼ� �޼��忡 �迭�� �Է��ϰ�
 * ������� ���
 */
public class _05_JudgeTrueFalse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num_list = new int[5];
		resultArray(InputArray(scan, num_list));
	}
	
	//�迭�� 5�� ����ޱ�
	public static int[] InputArray(Scanner scan, int[] list) {
		int[] i_array = {0,1,2,3,4};
		
		for(int a : i_array) {
			System.out.print((a+1) + "��° ���ڸ� �Է��ϼ���: ");
			list[a] = scan.nextInt();
		}
		
		return list;
	}
	
	//���
	public static void resultArray(int[] list) {
		for(int number: list) {
			if(number % 2 ==0) {
				System.out.println("¦��: "+number);
			}else {
				System.out.println("Ȧ��: "+number);
			}
			
		}
	}
}