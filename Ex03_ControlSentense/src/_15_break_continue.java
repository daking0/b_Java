/* ������ ���
 * �������� 2~9���� ���� ���ڰ� 1~5���� ��� 
 * 1)break����ؼ� �ذ�
 * 2)continue ����ؼ� �ذ�
 */
public class _15_break_continue {

	public static void main(String[] args) {
		//break ���
		for(int i =2; i<10; i++) {
			for(int j=1; j<9; j++) {
				if(j>5) {
					break;
				}
				System.out.println(i + " * "+j + " = "+ i*j);
			}
		}

		//continue ���
		for(int i =2; i<10; i++) {
			for(int j=1; j<9; j++) {
				if(j>5) {
					continue;
				}
				System.out.println(i + " * "+j + " = "+ i*j);
			}
		}

	}

}
