/*���������� ���������ε�
 *for������ ���� ���� ���̴� ������
 *for(int i=0;i<10;i++)
 */
public class _09_foreach {

	public static void main(String[] args) {
		int[] scores = {89,99,100,21,10};
		
		//for���� �̿��� ����
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]+", ");
		}
		System.out.println();
		
		//foreach���� �̿��� ����
		for(int score : scores) {
			System.out.println(score + ", ");
		}
	}

}
