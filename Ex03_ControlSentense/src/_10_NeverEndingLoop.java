import java.util.Scanner;

/*���ѷ���
 * if ���� + break���� ���� ���� ��찡 ����
 * 1) while(true)
 * 2)do{
 *    }while(true)
 * 3)for(;;)
 */

/*���� �Է¹ޱ�
 *�Է¹��� ���ڸ� ���ض�
 *-1�� �ԷµǸ� ���� ���� ����ϰ� ����
 */
public class _10_NeverEndingLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0, result =0;
		
		for(;;) {
			System.out.println("���� �Է�(-1�̸� ����)");
			num = scan.nextInt();
			if(num == -1){
				System.out.println(result);
				break;
			}
			result += num;
			
		}
		scan.close();

	}
}
