import java.util.Scanner;

/*2���� ���ڸ� double�� �Է�(nextDouble)
 * ������(+ - * /)�Է� (nextLine)
 * ��� ���
 */
/*nextInt(), nextDouble()���� �޼��带 ������� �� ���Ŀ� nextLine()�� ����ϸ� 
 * �����ִ� \n�� �о���̱� ������ nextLine()�޼��尡 �ٷ� �����ع�����.
 * �׷��Ƿ� nextLine()�� ȣ���ϱ� ���� nextLine()�� �� �� ���ָ� 
 * ���ۿ� �ִ� \n�о�����Ƿ� �� ���� ���ڿ��� �� ������.
 * =>next()�� ���๮��, ������ �����ϰ� ���ڸ� �Է¹޽��ϴ�.
 * => nextLine()�� �� �� ������ �Է¹ޱ� ������ ���๮�ڵ� �� �ٷ� �ν��մϴ�.
 * 
 * == : ���� ��ü�� �����ϴ°�
 * equals : ���빰�� ������
 * Java�� �ݵ�� ������ ���� ���� (���� ���ڿ����� ��) equals�� ��߸��Ѵ�.
*/
public class _4_ArithCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1 �Է�");
		double num1 = scan.nextDouble();
		scan.nextLine(); //�̰� �Ⱦ��� ���� �Է°��� �� �� ����ģ�� �Է����� �ν�
		System.out.println("����2 �Է�");
		double num2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("������ �Է�");
		String calc = scan.nextLine();
		double result=0.0;
		
		//�̷��Ե� ����!
		//String temp = scan.nextLine();
		//num1 = Double.parseDouble(temp);
		
		
//		switch(calc) {
//		case "+":
//			result = num1 + num2;
//			break;
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
//		}
//		
		if(calc.equals("+")) {
			result = num1 + num2;
		}else if(calc.equals("-")) {
			result = num1 - num2;
		}else if(calc.equals("*")) {
			result = num1 * num2;
		}else if(calc.equals("/")) {
			result = num1 / num2;
		}else {
			System.out.println("�߸� �Է�");
		}
			
		
		System.out.println("����� "+ result);

		scan.close();
	}
}
