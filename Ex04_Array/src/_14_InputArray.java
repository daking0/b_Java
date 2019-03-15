import java.util.Scanner;

/*7개의 double 배열을 할당하세요
 *앞의 5개에는 성적을 입력받고 
 *6번째는 총점, 7번째는 평균을 계산하여 넣고 
 *출력하세요.
 * */
public class _14_InputArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] scores = new double[7];
		
		//Arrays.fill(scores,0); ->0으로 다 채우기(초기화)
		
		int sum =0;
		double avg = 0;
		
		for(int i =0; i<5; i++) {
			System.out.println("점수를 입력하세요.");
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
				System.out.println("총점은 "+scores[k]);
			}else if(k == 6) {
				System.out.println("평균은 "+ scores[k]);
			}else {
				System.out.println(k+1 + "번째 점수는: "+scores[k]);
			}
			
		}
		//System.out.println("총점은 "+scores[5] + "점 이고, 평균은 "+ scores[6] +"점 이다.");
		
	}

}
