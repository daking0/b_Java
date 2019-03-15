import java.util.Arrays;
import java.util.Scanner;

/*3명 학생의 이름을 입력받고 배열에 저장
 *3명 학생의 국, 영, 수 점수를 입력받고 배열에 저장
 *학생의 총점과 평균 출력
 *국어 평균, 수학 평균, 영어 평균 출력
 */
public class _15_InputMultiArray {

	public static void main(String[] args) {
		final int STNUM = 3; //변함없음 (상수화)
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		
		String[][] student =new String[STNUM][];
		student[0] = new String[4];
		student[1] = new String[4];
		student[2] = new String[4];
		
		
		//이름 과 점수 받기
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(j==1) {
					System.out.println(student[i][0]+"학생의 국어 점수를 쓰세요:");
					student[i][j]=scan.next();
				}else if(j==2){
					System.out.println(student[i][0]+"학생의 영어 점수를 쓰세요:");
					student[i][j]=scan.next();
				}else if(j ==3) {
					System.out.println(student[i][0]+"학생의 수학 점수를 쓰세요:");
					student[i][j]=scan.next();
				}else if(j==0) {
					System.out.println("이름을 쓰세요:");
					student[i][0]=scan.next();
				}
			}
		}
		
		//총점과 평균 구해서 출력
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
