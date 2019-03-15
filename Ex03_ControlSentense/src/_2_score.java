import java.util.Scanner;

/*점수를 입력받는다
 * 90이상 A/ 80이상 B / 70이상 C/ 60이상 D/ 50이상 F
 */
public class _2_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		String scoreresult ="";
		
		if(score >= 90) {
			scoreresult = "A학점";
		}else if(score >= 80){
			scoreresult = "B학점";
		}else if(score >= 70){
			scoreresult = "C학점";
		}else if(score >= 60){
			scoreresult = "D학점";
		}else if(score >= 50){
			scoreresult = "F학점";
		}else {
			scoreresult = "탈락";
		}
		
		System.out.println("결과는 " + scoreresult);
	}

}
