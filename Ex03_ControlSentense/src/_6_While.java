import java.util.Scanner;

/*while :�� �� �ݺ����� �𸣸� ���
 *do~while : 1���� �����ϰ� ���� �Ǵ��ϰ� ���� ��
 *for : ���۰� ���� ��Ȯ�� ��
 *��ȣȣȯ�� �ȴ�
 */

/*����ڷκ��� ���ڸ� �Է¹ް�
 * ������ �ش� ���ڸ�ŭ ��������
 * ���������� ������ �� ���
*/
public class _6_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		int sum = 0;
		
		while(num > 0) {
			sum++;
			num--;
			System.out.println("������ " +sum + "�� �����.");
		}
		System.out.println("��");
//		
//		int i =0;
//		while(i<num) {
//			i++;
//			System.out.println("����"+i+"�����");
//		}
//		System.out.println("��");
	}

}
