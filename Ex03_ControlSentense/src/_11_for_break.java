import java.util.Scanner;

/*������ �Է��϶�
 * �Է¹��� ���� �߿� 3�ڸ� ���� ���ض� (100 ~ 999)
 * �ٸ� �ڸ� ���ڰ� �ԷµǸ� 3�ڸ��� �Է��ϼ��� ��� ���
 * exit �Է��ϸ� ���� ���� ����ϰ� ����
*/
public class _11_for_break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 ="";
		int num =0, result =0;
		
		while(true) {
			System.out.println("�Է��ϼ���.");
			num1 =scan.nextLine();
			
			if(num1.equals("exit")) {
				System.out.println(result);
				break;
			}else{
				num = Integer.parseInt(num1);
				if(num - 100 >=0) {
					result += num;
				}else {
					System.out.println("�߸��Է�");
				}
			}
		}
//		temp = num /100;
//	    if(temp > = 1 && temp <=9)
//		   sum += num
		scan.close();
	}
}
