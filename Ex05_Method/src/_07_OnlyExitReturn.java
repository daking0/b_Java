/*return =>�ʸ� ȣ���� ������ ���ư���
 *return num =>num�̶�� ���� ������ ���ư���
 *return; =>�׳� ���ư���(����)
 */
public class _07_OnlyExitReturn {
	public static void main(String[] args) {
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}
	
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0���� ���� �� ����");
			return;
		}
		System.out.println("������ ���: " + (num1/num2) );
	}
}