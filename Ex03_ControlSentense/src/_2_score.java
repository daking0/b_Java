import java.util.Scanner;

/*������ �Է¹޴´�
 * 90�̻� A/ 80�̻� B / 70�̻� C/ 60�̻� D/ 50�̻� F
 */
public class _2_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = scan.nextInt();
		String scoreresult ="";
		
		if(score >= 90) {
			scoreresult = "A����";
		}else if(score >= 80){
			scoreresult = "B����";
		}else if(score >= 70){
			scoreresult = "C����";
		}else if(score >= 60){
			scoreresult = "D����";
		}else if(score >= 50){
			scoreresult = "F����";
		}else {
			scoreresult = "Ż��";
		}
		
		System.out.println("����� " + scoreresult);
	}

}
