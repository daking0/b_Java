import java.util.Scanner;

//3���� ������ �Է¹ް� ���հ� ����� ���
public class _15_SumAvg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg =0;
		
		System.out.println("ù��° �Է�");
		int num1 = scan.nextInt();
		
		System.out.println("ù��° �Է�");
		int num2 = scan.nextInt();
				
		System.out.println("ù��° �Է�");
		int num3 = scan.nextInt();
				
		sum = num1 + num2 + num3;
		avg = sum/(double)3;
		
		System.out.println("������ "+ sum);
		System.out.println("����� "+ avg);
		
		System.out.format("��� �Ҽ� 2�ڸ� %.2f\n", avg);
		System.out.println(String.format("��� �Ҽ� 3�ڸ� %.3f\n", avg));
	}

}
