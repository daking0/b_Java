import java.util.Arrays;
import java.util.Scanner;

/*3�� �л��� �̸��� �Է¹ް� �迭�� ����
 *3�� �л��� ��, ��, �� ������ �Է¹ް� �迭�� ����
 *�л��� ������ ��� ���
 *���� ���, ���� ���, ���� ��� ���
 */
public class _15_InputMultiArray {

	public static void main(String[] args) {
		final int STNUM = 3; //���Ծ��� (���ȭ)
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		
		String[][] student =new String[STNUM][];
		student[0] = new String[4];
		student[1] = new String[4];
		student[2] = new String[4];
		
		
		//�̸� �� ���� �ޱ�
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(j==1) {
					System.out.println(student[i][0]+"�л��� ���� ������ ������:");
					student[i][j]=scan.next();
				}else if(j==2){
					System.out.println(student[i][0]+"�л��� ���� ������ ������:");
					student[i][j]=scan.next();
				}else if(j ==3) {
					System.out.println(student[i][0]+"�л��� ���� ������ ������:");
					student[i][j]=scan.next();
				}else if(j==0) {
					System.out.println("�̸��� ������:");
					student[i][0]=scan.next();
				}
			}
		}
		
		//������ ��� ���ؼ� ���
		for(int i=0;i<3;i++) {
			int sum=0;
			double avg = 0.0;
			for(int j=1;j<4;j++) {
				sum += Integer.parseInt(student[i][j]);
				avg = sum / 3.0;
			}
			
			System.out.println(sum + " & "+avg);
			
		}
	
		
	}

}
