import java.util.Random;
/*����(������ ��) - ������ ���Ǵ�� �ٲ� ��
������������ ������ ���� ��� ���� �� ���
ex)�ֻ��� ���� 
*/
public class _9_Random {

	public static void main(String[] args) {
		Random random = new Random();
		//10 �̸��� ���� ���� ���
		for(int j =0; j < 10; j++) {
			for(int i =0; i<20;i++) {
				int num = random.nextInt(10);
				System.out.print(num + ", ");
			}
			System.out.println();
		}
		
		
	}

}
