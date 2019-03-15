import java.util.Arrays;

/*<���� ����>
 * �迭 ������ �ٸ� �迭�� �����ϸ� �ؽ��ڵ� ���� ���簡 �ȴ�.
 * �׷��Ƿ� ���� ���� ������ ����Ű�� �ȴ�.
 */
public class _05_arrayCopy {

	public static void main(String[] args) {
		int[] scores = {100, 88, 95, 65, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		for(int i=0;i<scores2.length;i++)
			System.out.println(scores2[i] + ", ");
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		//���� ������ �� ��ŸŸ�� ����
		scores[0] = 30;
		System.out.println(scores1[0]);
		System.out.println(scores2[0]);
		
		/*���� ����
		 * Arrays.copyOf�� ������ ������ ���� ���簡 �Ͼ��.
		 * �� �޸𸮿� �迭������ �Ҵ�ǰ� ���� �����ȴ�.
		 * ������ �迭�� ����Ű�� ���������� �ٸ� hashCode�� ������ �ȴ�.
		 */
		int[] scores4 = Arrays.copyOf(scores, scores.length); 
		
		for(int i =0; i<scores4.length;i++) {
			System.out.println(scores4[i]);
		}
		scores[0] = 70; //���� �ٲ��� �ʴ´�.
		System.out.println(scores4[0]);
		System.out.println(scores);
		System.out.println(scores4);
		}
		
	}

