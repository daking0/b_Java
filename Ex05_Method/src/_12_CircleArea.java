import java.util.Scanner;

/*���� ������ �Է¹ޱ�
 *���� ���� ���ϴ� �޼��� ����
 *���� �ѷ� ���ϴ� �޼��� ����
 *����غ�����
 */
public class _12_CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		double circle =scan.nextDouble();
		
		double care = carea(circle);
		System.out.println("���̴� "+care);
		cference(circle);
	}
	
	public static double carea(double circle) {
		double carea = circle * circle * 3.14;
		return carea;
	}
	
	public static void cference(double circle) {
		double cference = circle * 2 * 3.14;
		System.out.println("�ѷ��� "+cference);
	}

}
