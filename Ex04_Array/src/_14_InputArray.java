import java.util.Scanner;

/*7���� double �迭�� �Ҵ��ϼ���
 *���� 5������ ������ �Է¹ް� 
 *6��°�� ����, 7��°�� ����� ����Ͽ� �ְ� 
 *����ϼ���.
 * */
public class _14_InputArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] scores = new double[7];
		
		//Arrays.fill(scores,0); ->0���� �� ä���(�ʱ�ȭ)
		
		int sum =0;
		double avg = 0;
		
		for(int i =0; i<5; i++) {
			System.out.println("������ �Է��ϼ���.");
			scores[i] = scan.nextDouble();
			sum += scores[i];
			//scores[5] += scoresc[i];
		}
		
		scores[5] = sum;
		avg= sum / 5;
		scores[6] = avg;
		//scores[6] = scores[5]/5;
		
		for(int k =0; k <scores.length; k++) {
			if(k == 5) {
				System.out.println("������ "+scores[k]);
			}else if(k == 6) {
				System.out.println("����� "+ scores[k]);
			}else {
				System.out.println(k+1 + "��° ������: "+scores[k]);
			}
			
		}
		//System.out.println("������ "+scores[5] + "�� �̰�, ����� "+ scores[6] +"�� �̴�.");
		
	}

}
