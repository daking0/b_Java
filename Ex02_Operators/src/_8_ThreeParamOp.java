import java.util.Scanner;

//����ڷκ��� ������ �Է¹޾ƶ�
//Ȧ������ ¦������ ���ǿ����ڷ� �Ǻ��ϰ� ��� ���
public class _8_ThreeParamOp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String a = (num % 2 ==0) ? "¦��" : "Ȧ��";
		System.out.println(a);

//		String strNum = "";
//		if(num % 2 == 0) {
//			strNum = "¦��";
//		}else {
//			strNum = "Ȧ��";
//		}
//		System.out.println(strNum);
		
		scan.close();
	}

}
